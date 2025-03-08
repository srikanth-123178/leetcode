import React from 'react';
import Chat from './Chat';
import './App.css'; // Contains all custom styles for the navbar, footer, etc.

function App() {
  return (
    <div className="d-flex flex-column min-vh-100">
      {/* Navbar Section */}
      <header>
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
          <div className="container-fluid">
            <span className="navbar-brand mb-0 h1">My Chat App</span>
          </div>
        </nav>
      </header>

      {/* Main Content Section */}
      <main className="container my-4 flex-grow-1">
        <Chat />
      </main>

      {/* Footer Section */}
      <footer className="footer mt-auto bg-light text-center py-3">
        <p className="mb-0">© 2025 My Chat App. All rights reserved.</p>
      </footer>
    </div>
  );
}

export default App;
