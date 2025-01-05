# Quiz App - Microservices Architecture

## Table of Contents
- [Overview](#overview)
- [Architecture](#architecture)
- [Services](#services)
  - [User Management Service](#user-management-service)
  - [Quiz Management Service](#quiz-management-service)
  - [Result Management Service](#result-management-service)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [APIs and Endpoints](#apis-and-endpoints)
  - [User Management Service Endpoints](#user-management-service-endpoints)
  - [Quiz Management Service Endpoints](#quiz-management-service-endpoints)
  - [Result Management Service Endpoints](#result-management-service-endpoints)
- [Testing the Application](#testing-the-application)
- [License](#license)

---

## Overview

The **Quiz App** is a microservices-based application designed to manage quizzes, user authentication, and results. It consists of three main services:

1. **User Management Service**: Handles user registration, authentication, and role-based access control.
2. **Quiz Management Service**: Manages quizzes, including creating, updating, and fetching quiz questions.
3. **Result Management Service**: Manages quiz results and scoring for users.

This architecture promotes scalability, modularity, and ease of maintenance.

---

## Architecture

The system follows a microservices architecture, with each service handling specific responsibilities. The services communicate via RESTful APIs.

### Key Features:
- Spring Boot for backend services.
- Secure authentication using Spring Security and JWT.
- MySQL as the database.
- Dockerized for deployment.

---

## Services

### 1. User Management Service
- **Purpose**: Manages user accounts, authentication, and roles (Admin, User).
- **Features**:
  - Register and login users.
  - Role-based access control.
  - JWT token generation for secure API access.

### 2. Quiz Management Service
- **Purpose**: Handles quiz creation, updates, and retrieval.
- **Features**:
  - CRUD operations for quizzes.
  - Assign quizzes to users.

### 3. Result Management Service
- **Purpose**: Tracks and manages quiz results.
- **Features**:
  - Store and retrieve quiz scores.
  - Calculate and display user performance.

---

## Technologies Used

- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA
- **Authentication**: JWT
- **Database**: MySQL
- **Dependency Management**: Maven
- **Logging**: SLF4J, Logback
- **Testing**: JUnit
- **API Documentation**: Swagger
- **Deployment**: Docker

---

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/quiz-app.git
   cd quiz-app
   ```

2. Configure databases for each service:
   - Create MySQL databases for `user_management`, `quiz_management`, and `result_management`.
   - Update the `application.properties` or `application.yml` files with database credentials.

3. Install dependencies:
   ```bash
   mvn clean install
   ```

4. Start each service:
   ```bash
   cd user-management-service
   mvn spring-boot:run
   ```
   Repeat for `quiz-management-service` and `result-management-service`.

5. Use Postman or Swagger to test APIs.

6. (Optional) Build Docker images:
   ```bash
   docker-compose up --build
   ```

---

## APIs and Endpoints

### User Management Service Endpoints

| Method | Endpoint                  | Description                    |
|--------|---------------------------|--------------------------------|
| POST   | `/api/auth/register`      | Register a new user           |
| POST   | `/api/auth/login`         | Login and get a JWT token     |
| GET    | `/api/users`              | Fetch all users (Admin only)  |
| PUT    | `/api/users/{id}`         | Update user details           |
| DELETE | `/api/users/{id}`         | Delete a user                 |

---

### Quiz Management Service Endpoints

| Method | Endpoint                  | Description                      |
|--------|---------------------------|----------------------------------|
| POST   | `/api/quizzes`            | Create a new quiz (Admin only)  |
| GET    | `/api/quizzes`            | Get all quizzes                 |
| GET    | `/api/quizzes/{id}`       | Get a specific quiz             |
| PUT    | `/api/quizzes/{id}`       | Update a quiz (Admin only)      |
| DELETE | `/api/quizzes/{id}`       | Delete a quiz (Admin only)      |

---

### Result Management Service Endpoints

| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| POST   | `/api/results`            | Submit quiz results            |
| GET    | `/api/results/user/{id}`  | Fetch results for a user       |
| GET    | `/api/results/quiz/{id}`  | Fetch results for a quiz       |

---

## Testing the Application

### Using Postman

1. Import the Postman collection provided in the repository (if available).
2. Test the endpoints by sending appropriate requests (e.g., register a user, create a quiz, submit results).
3. Include the JWT token in the `Authorization` header for secured endpoints.

### Using Swagger

1. Start the services.
2. Open the Swagger UI (e.g., `http://localhost:8080/swagger-ui.html`).
3. Explore and test the available APIs.

---

## License

This project is licensed under the MIT License. See `LICENSE` for more details.
