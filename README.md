# Task Manager API - Authentication Microservice

This is a secure RESTful API built with Spring Boot 3 for handling user authentication... The project was developed focusing on security (JWT), strong software engineering practices, and readiness for DevOps environments.

## Key Features

* **Secure Authentication:** Full implementation of **JWT (JSON Web Tokens)** for stateless, secure user authentication and authorization.
* **RESTful Design:** : Strictly follows REST principles for resource manipulation (CRUD operations).
* **API Documentation:** : Integrated with **Swagger/OpenAPI** for dynamic and up-to-date API exploration.
* **Containerization:** : Ready for deployment using **Docker** containers.
* **Code Quality** : Strong focus on Clean Architecture and comprehensive Unit Testing coverage.

---

## Tech Stack & Good Practices

This project was developed using industry-standard tools and practices, crucial for scalable backend systems.

| Category | Technology / Practice | Why it Matters |
| :--- | :--- | :--- |
| **Backend Core** | **Java 17 (or latest LTS)**, **Spring Boot 3** | Provides a robust, enterprise-level environment for microservices. |
| **Authentication** | **Spring Security**, **JWT** | Ensures a secure, token-based system for protecting endpoints. |
| **Data Layer** | **PostgreSQL**, **Spring Data JPA/Hibernate** | Relational database crucial for data integrity, paired with an efficient ORM. |
| **Quality** | **JUnit 5**, **Mockito**, **Testcontainers** | Guarantees code reliability through Unit and Integration Tests. |
| **DevOps** | **Docker** | Simplifies dependency management and ensures consistent deployment environments. |
| **Architecture** | **Clean Architecture / Layered Architecture** | Promotes separation of concerns, testability, and maintainability. |

---

## Getting Started

### Prerequisites

You need the following installed locally:

* Java Development Kit (JDK 17+)
* Docker
* Maven (or Gradle)

### 1. Database Setup

The application uses PostgreSQL. The easiest way to run the database is via Docker:

```bash
docker run --name auth-db -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=taskdb -p 5432:5432 -d postgres
```

### 2. Build and Run
Clone the repository:

```bash
git clone https://github.com/leosato957/task-manager-spring-boot.git
cd task-manager-api
```

Build the project:
```bash
./mvnw clean install
```

Run the application:
```bash
./mvnw spring-boot:run
```

The API will be available at http://localhost:8080.

### API Endpoints & Documentation
Once the server is running, you can access the interactive documentation:

Swagger UI: http://localhost:8080/swagger-ui/index.html

### Key Endpoints:
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/auth/register` | Register a new user. |
| `POST` | `/auth/login` | Authenticate and receive a JWT. |
| `GET` | `/api/tasks` | Example protected resource (requires JWT). |
