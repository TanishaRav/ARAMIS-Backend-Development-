# ARAMIS-Backend-Development-
Working with the Alstom ARAMIS Database to simulate basic CRUD Operations 

# Aramis User Management Backend

This is a Spring Boot application designed to manage user data (such as administrators, editors, mentors, and reviewers) via a REST API. It supports basic CRUD operations and integrates easily with Postman for testing.

## Features

- Add new users
- Update existing users
- Delete users
- Fetch individual or all users
- Works seamlessly with Postman for testing

## Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database (for local testing)**
- **Postman** (for API requests)

---

##  Getting Started
### 1. Open in IDE

- Open the project folder in IntelliJ or VS Code.
- Make sure your `pom.xml` or `build.gradle` dependencies are installed.

### 2. Configure PostgreSQL

- Make changes to your application.properties file 
- Make sure PostgreSQL is running and your database connection is tested. 

### 3. Run the Application

- Run your Spring Boot application and connect to the local host on port 8080 after connecting it to your database.

---

## API ENDPOINTS

| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| GET    | `/users`      | Fetch all users         |
| GET    | `/users/{id}` | Get user by ID          |
| POST   | `/users`      | Add a new user          |
| PUT    | `/users/{id}` | Update an existing user |
| DELETE | `/users/{id}` | Delete a user           |

---

### Working Process:

![Screenshot 2025-07-03 153751](https://github.com/user-attachments/assets/62ee3a4d-402d-4e81-af54-777654cf1630)

![Screenshot 2025-07-03 153736](https://github.com/user-attachments/assets/0ed2c37b-0332-433a-a1d2-f4d42d1cf42f)

![Screenshot 2025-07-03 153801](https://github.com/user-attachments/assets/eec8cb38-ccec-4024-8e69-a20aa273b138)


---

### My Contributions and Learning

This backend was built as part of a hands-on learning experience in Spring Boot and database integration. Through this project, I gained practical exposure in:

- Structuring a REST API using Spring Boot

- Connecting and persisting data using PostgreSQL

- Performing CRUD operations and testing endpoints with Postman

- Debugging issues related to endpoints, status codes, and data persistence

I would like to thank Mrs. Apeksha Mahale, my mentor, for guiding me throughout this project. Her feedback helped me understand Spring Boot architecture more deeply and encouraged me to resolve challenges independently.

---

### Learning Outcome:

- Learned to perform CRUD Operations successfully.
- Learned to use various tools such as springboot, Maven, Postman, pgAdmin, etc.
- Learnt methods to do reverse engineering and create JPA entities and databases.

---

## Author

**Tanisha Ravindran**  
Built and modified this application as part of my learning experience and onboarding at **Alstom**.

Student at Iowa State University | Alstom Intern

---

## License

This project was built for educational purposes.
