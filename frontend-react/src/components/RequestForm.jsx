import { useState } from "react";
import { createRequest } from "../api/requestsApi";

function RequestForm({ onCreated }) {
  const [title, setTitle] = useState("");
  const [type, setType] = useState("REQUEST");
  const [manualPriority, setManualPriority] = useState(0);

  const handleSubmit = async (e) => {
    e.preventDefault();

    await createRequest({
      title,
      type,
      manualPriority: Number(manualPriority),
    });

    setTitle("");
    setManualPriority(0);
    onCreated();
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Create Request</h3>

      <input
        placeholder="Title"
        value={title}
        onChange={(e) => setTitle(e.target.value)}
        required
      />

      <select value={type} onChange={(e) => setType(e.target.value)}>
        <option value="INCIDENT">INCIDENT</option>
        <option value="REQUEST">REQUEST</option>
        <option value="QUESTION">QUESTION</option>
      </select>

      <input
        type="number"
        value={manualPriority}
        onChange={(e) => setManualPriority(e.target.value)}
      />

      <button type="submit">Create</button>
    </form>
  );
}

export default RequestForm;
