# User Management Service

The **User Management Service** is a backend microservice designed to handle user authentication, authorization, and role-based access control (RBAC). It provides APIs for user management, role assignments, and permission handling using Spring Boot and JWT.

---

## Features

- User Authentication with JWT tokens.
- Role-Based Access Control (RBAC).
- Secure and scalable architecture following REST standards.
- Modular design for ease of maintenance.
- Integration with MySQL database for persistence.
- Uses ModelMapper for POJO-DTO mapping.
- Built-in token validation and expiration.

---

## Technologies Used

- **Java**: Backend programming language.
- **Spring Boot**: Framework for building RESTful APIs.
- **JWT (JSON Web Tokens)**: Authentication and authorization.
- **MySQL**: Relational database for user and role data.
- **Lombok**: Reduces boilerplate code.
- **ModelMapper**: Simplifies object mapping.
- **Maven**: Dependency management and build tool.

---

## Project Structure

```
user-management-service
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.quizapp.user_management_service
│   │   │   │   ├── config
│   │   │   │   │   └── SecurityConfig.java
│   │   │   │   ├── controller
│   │   │   │   │   ├── AuthController.java
│   │   │   │   │   ├── UserController.java
│   │   │   │   │   └── AdminController.java
│   │   │   │   ├── dto
│   │   │   │   │   └── (Request and Response DTOs)
│   │   │   │   ├── entity
│   │   │   │   │   ├── User.java
│   │   │   │   │   ├── Role.java
│   │   │   │   │   └── Permission.java
│   │   │   │   ├── repository
│   │   │   │   │   ├── UserRepository.java
│   │   │   │   │   ├── RoleRepository.java
│   │   │   │   │   └── PermissionRepository.java
│   │   │   │   ├── service
│   │   │   │   │   ├── UserService.java
│   │   │   │   │   ├── AuthService.java
│   │   │   │   │   ├── AdminService.java
│   │   │   │   │   └── impl
│   │   │   │   │       ├── UserServiceImpl.java
│   │   │   │   │       ├── AuthServiceImpl.java
│   │   │   │   │       └── AdminServiceImpl.java
│   │   │   │   └── util
│   │   │   │       ├── JWTUtil.java
│   │   │   │       ├── MapperUtil.java
│   │   │   │       └── PasswordUtil.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── pom.xml
└── README.md
```

---

## How to Run

### Prerequisites

- **Java 17 or higher**
- **Maven**
- **MySQL Database**

### Steps

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd user-management-service
   ```

2. Configure the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/user_management_db
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update

   jwt.secret=mySuperSecretKeyForJWTGeneration12345
   jwt.expiration=36000000
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. The application will be available at:
   ```
   http://localhost:8080
   ```

---

## API Endpoints

### Authentication

- **POST** `/auth/login` - Authenticate user and return JWT.

### User Management

- **POST** `/users` - Create a new user.
- **GET** `/users/{id}` - Retrieve user by ID.
- **PUT** `/users/{id}` - Update user information.
- **DELETE** `/users/{id}` - Delete user.

### Role Management

- **POST** `/roles` - Create a new role.
- **GET** `/roles/{id}` - Retrieve role by ID.
- **PUT** `/roles/{id}` - Update role.
- **DELETE** `/roles/{id}` - Delete role.

---

## Tools & Libraries

- **Spring Security**: To secure the APIs.
- **JWT**: For token generation and validation.
- **Lombok**: For reducing boilerplate code.
- **ModelMapper**: For object mapping.

---

## Future Enhancements

- Add email verification.
- Implement OAuth2 for third-party authentication.
- Add support for logging and monitoring.
- API rate limiting for enhanced security.

---

## License

This project is licensed under the MIT License.

---

## Contact

For any queries or support, please contact:

- **Name**: Shaik Ameer
- **Linkedin**: [ameer-shaik](https://www.linkedin.com/in/ameer-shaikk/)
- **Email**: [shaikameerjann@gmail.com](shaikameerjann@gmail.com)
