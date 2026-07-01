# 📝 Backend Quiz Application

A robust and scalable **Quiz Management System** developed using **Java Spring Boot**. This application provides RESTful APIs to create, manage, and attempt quizzes. It enables efficient question management and quiz evaluation while following a layered architecture and best backend development practices.

---

# 🚀 Features

## Admin Features

* Add new quiz questions
* Update existing questions
* Delete questions
* View all questions
* Filter questions by category
* Create quizzes from selected categories
* Manage quiz details

## User Features

* Attempt quizzes
* Submit quiz answers
* View quiz score after submission
* Retrieve quiz questions
* View quiz details

---

# 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Database

* MySQL

### API Testing

* Postman

### Build Tool

* Maven

### Version Control

* Git
* GitHub

### IDE

* IntelliJ IDEA

---

# 📂 Project Structure

```text
BackendQuizApplication
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   ├── entity
│   │   │   ├── dto
│   │   │   ├── exception
│   │   │   └── BackendQuizApplication.java
│   │   │
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── static
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# ⚙️ Installation

## 1. Clone the Repository

```bash
git clone https://github.com/yourusername/backend-quiz-application.git
```

## 2. Navigate to the Project

```bash
cd backend-quiz-application
```

## 3. Create MySQL Database

```sql
CREATE DATABASE quizdb;
```

## 4. Configure Database

Update the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 5. Build the Project

```bash
mvn clean install
```

## 6. Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

# 📡 REST API Endpoints

## Question APIs

| Method | Endpoint                        | Description                    |
| ------ | ------------------------------- | ------------------------------ |
| GET    | `/question/allQuestions`        | Retrieve all questions         |
| GET    | `/question/category/{category}` | Retrieve questions by category |
| POST   | `/question/add`                 | Add a new question             |
| PUT    | `/question/update/{id}`         | Update an existing question    |
| DELETE | `/question/delete/{id}`         | Delete a question              |

## Quiz APIs

| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| POST   | `/quiz/create`      | Create a new quiz       |
| GET    | `/quiz/get/{id}`    | Retrieve quiz questions |
| POST   | `/quiz/submit/{id}` | Submit quiz answers     |
| GET    | `/quiz/result/{id}` | Retrieve quiz score     |

---

# 🗄️ Database Design

The application stores data in MySQL using Spring Data JPA.

### Main Tables

* Question
* Quiz
* Quiz Questions
* Responses

---

# 🔄 Application Workflow

1. Admin adds quiz questions.
2. Questions are stored in the MySQL database.
3. Admin creates quizzes using selected categories.
4. Users retrieve quiz questions.
5. Users submit their answers.
6. The system evaluates responses.
7. Final score is returned through the API.

---

# 🔐 Key Features

* RESTful API Design
* Layered Architecture
* CRUD Operations
* Database Integration using Hibernate
* Spring Data JPA Repository Pattern
* Exception Handling
* Clean Code Structure
* Scalable Backend Design

---

# 📚 Skills Demonstrated

This project showcases practical experience in:

* Core Java
* Object-Oriented Programming (OOP)
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate ORM
* RESTful API Development
* MySQL
* Maven
* Git & GitHub
* Backend Development
* API Testing with Postman

---

# 📸 Screenshots

You can include screenshots such as:

* Database Tables
* Postman API Requests
* Successful API Responses
* Quiz Creation
* Quiz Submission
* Score Calculation

---

# 🚀 Future Enhancements

* Spring Security Authentication
* JWT-Based Authorization
* User Registration & Login
* Timer-Based Quizzes
* Difficulty Levels
* Leaderboard
* Randomized Questions
* Pagination & Search
* Docker Deployment
* AWS/Render Deployment
* Swagger/OpenAPI Documentation

---

# 👨‍💻 Author

**Pasupuleti Jnana Manikanta Pavan Kumar**

**Java Backend Developer**

* LinkedIn: https://www.linkedin.com/in/your-linkedin-profile
* GitHub: https://github.com/your-github-username

---

# ⭐ Support

If you found this project useful, consider giving it a **⭐ Star** on GitHub. It helps others discover the project and motivates future improvements.
