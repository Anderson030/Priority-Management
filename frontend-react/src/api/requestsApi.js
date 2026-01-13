const API_URL = "http://localhost:8080/requests";

export async function createRequest(data) {
  const response = await fetch(API_URL, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  });

  if (!response.ok) {
    throw new Error("Error al crear la solicitud");
  }

  return response.json();
}

export async function getRequests() {
  const response = await fetch(API_URL);

  if (!response.ok) {
    throw new Error("Error al obtener las solicitudes");
  }

  return response.json();
}
