# Priority Management System

This project is a **fullstack application** that manages and prioritizes requests using a **rule-based priority engine**.

The main goal is to calculate the priority of each request automatically based on simple and extensible business rules.

---

## 🧠 Project Overview

The application allows users to:

- Create requests
- Assign a type to each request (INCIDENT, REQUEST, QUESTION)
- Optionally define a manual priority
- Automatically calculate the final priority
- View all requests ordered by priority

The system is divided into **backend** and **frontend** to keep responsibilities clear.

---

## 🏗️ Architecture

### Backend (Spring Boot)

The backend follows a layered architecture:

- **Controller**: Exposes REST endpoints
- **Service**: Handles business logic
- **Repository**: Accesses the database
- **Model**: Represents domain entities
- **Rule Engine**: Calculates priority using independent rules

#### Priority Engine (Core of the System)

The core component is the `PriorityEngine`.

- It receives a list of priority rules
- Each rule implements a common interface
- The engine applies all rules and sums their results
- New rules can be added without changing the engine

Current rules:
- Incident priority rule
- Age-based priority rule
- Manual priority rule

---

### Frontend (React)

The frontend is a simple React application that:

- Creates new requests
- Displays requests ordered by priority
- Communicates with the backend using REST API

The UI is intentionally simple to focus on functionality.

---

## 🔧 Technologies Used

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

### Frontend
- React
- JavaScript
- Fetch API
- CSS

---

## 📁 Project Structure

Priority-Management/
├── backend/
│ └── Spring Boot project
├── frontend-react/
│ └── React application
└── README.md


-------------------------


---

## 📥 How to Clone the Project

Make sure you have **Git** installed.

```bash
git clone https://github.com/Anderson030/Priority-Management.git
cd Priority-Management
------------------

▶️ How to Run the Backend
Requirements

Java 17+

Maven

Steps

cd backend
./mvnw spring-boot:run

The backend will start at:
http://localhost:8080

---------
▶️ How to Run the Frontend
Requirements

Node.js

npm

Steps

cd frontend-react
npm install
npm start
-------------------------
http://localhost:3000

------------------------


🔁 Application Flow

The user creates a request in the frontend

The frontend sends the data to the backend

The backend converts the input into an entity

The priority engine applies all rules

The calculated priority is stored

The frontend shows the ordered list

-------------------------

✅ Design Decisions

Rules are independent and reusable

Business logic is separated from controllers

DTOs are used to protect entities

The solution is simple and easy to extend

Focused on junior-level best practices

------------------------------

Future Improvements

Add authentication

Add validation rules

Externalize priority values

Add tests

Improve UI design

---------------------------------------
Anderson Estiduar Blandón Alvarez
Junior Fullstack Developer










