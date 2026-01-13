import { useEffect, useState } from "react";
import { getRequests } from "./api/requestsApi";
import RequestForm from "./components/RequestForm";
import RequestList from "./components/RequestList";
import "./App.css";

function App() {
  const [requests, setRequests] = useState([]);

  const loadRequests = async () => {
    const data = await getRequests();
    setRequests(data);
  };

  useEffect(() => {
    loadRequests();
  }, []);

  return (
    <div className="app-container">
      <h2>Priority Management</h2>

      <RequestForm onCreated={loadRequests} />
      <RequestList requests={requests} />
    </div>
  );
}

export default App;
