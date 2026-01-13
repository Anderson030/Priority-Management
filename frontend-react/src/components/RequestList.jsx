function RequestList({ requests }) {
  return (
    <div>
      <h3>Requests (ordered by priority)</h3>

      <ul>
        {requests.map((r) => (
          <li key={r.id}>
            <strong>{r.title}</strong> | {r.type} | Priority:{" "}
            {r.calculatedPriority}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default RequestList;
