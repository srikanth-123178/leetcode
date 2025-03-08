import React, { useState, useEffect } from 'react';
import SockJS from 'sockjs-client';
import { Client } from '@stomp/stompjs';
import 'bootstrap/dist/css/bootstrap.min.css';

const LANGUAGE_OPTIONS = [
  { code: 'en', label: 'English' },
  { code: 'es', label: 'Spanish' },
  { code: 'fr', label: 'French' },
  { code: 'de', label: 'German' },
];

function Chat() {
  const [client, setClient] = useState(null);
  const [isConnected, setIsConnected] = useState(false);
  const [message, setMessage] = useState('');
  const [chatMessages, setChatMessages] = useState([]);
  const [targetLanguage, setTargetLanguage] = useState('en'); // default
  const [username, setUsername] = useState('User'); // optional: dynamic name

  useEffect(() => {
    const stompClient = new Client({
      webSocketFactory: () => new SockJS('http://localhost:8080/chat'),
      reconnectDelay: 5000,
      onConnect: () => {
        // Subscribe to the public topic
        stompClient.subscribe('/topic/public', (msg) => {
          const receivedMessage = JSON.parse(msg.body);
          setChatMessages((prev) => [...prev, receivedMessage]);
        });
        setIsConnected(true);
      },
      onStompError: (frame) => {
        console.error('Broker error:', frame.headers['message']);
        console.error('Additional details:', frame.body);
      },
      onWebSocketError: (event) => {
        console.error('WebSocket error:', event);
      },
    });

    stompClient.activate();
    setClient(stompClient);

    return () => {
      stompClient.deactivate();
    };
  }, []);

  const sendMessage = () => {
    if (!isConnected) {
      alert('Not connected yet. Please wait...');
      return;
    }
    if (message.trim() !== '') {
      const chatMessage = {
        sender: username,
        content: message,
        type: 'CHAT',
        targetLanguage: targetLanguage,
      };

      client.publish({
        destination: '/app/chat.sendMessage',
        body: JSON.stringify(chatMessage),
      });

      setMessage('');
    }
  };

  return (
    <div className="p-4 bg-white rounded shadow">
      <h3 className="text-center mb-3">Chat Room</h3>

      {/* Username and Language Selection Row */}
      <div className="row mb-3">
        <div className="col-md-6 mb-2">
          <label className="form-label fw-bold">Username:</label>
          <input
            type="text"
            className="form-control"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            placeholder="Enter your name..."
          />
        </div>
        <div className="col-md-6 mb-2">
          <label className="form-label fw-bold">Target Language:</label>
          <select
            className="form-select"
            value={targetLanguage}
            onChange={(e) => setTargetLanguage(e.target.value)}
          >
            {LANGUAGE_OPTIONS.map((lang) => (
              <option key={lang.code} value={lang.code}>
                {lang.label}
              </option>
            ))}
          </select>
        </div>
      </div>

      {/* Chat Display Area */}
      <div className="chat-card d-flex flex-column mb-3">
        {chatMessages.map((msg, index) => {
          const isOwnMessage = msg.sender === username;
          return (
            <div
              key={index}
              className={`d-flex ${
                isOwnMessage ? 'justify-content-end' : 'justify-content-start'
              }`}
            >
              <div
                className={`chat-bubble ${
                  isOwnMessage ? 'chat-bubble-sender' : 'chat-bubble-receiver'
                }`}
              >
                <strong>{msg.sender}:</strong> {msg.content}
                <br />
                <em>Translated:</em> {msg.translatedContent}
              </div>
            </div>
          );
        })}
      </div>

      {/* Message Input and Send Button */}
      <div className="input-group">
        <input
          type="text"
          className="form-control"
          placeholder="Type your message..."
          value={message}
          onChange={(e) => setMessage(e.target.value)}
        />
        <button className="btn btn-primary" onClick={sendMessage}>
          Send
        </button>
      </div>
    </div>
  );
}

export default Chat;
