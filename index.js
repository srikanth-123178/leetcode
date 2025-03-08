import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import 'bootstrap/dist/css/bootstrap.min.css';


// Create a root using the root container (the <div> with id="root" in index.html).
const root = ReactDOM.createRoot(document.getElementById('root'));

// Then render your app with the root.
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
