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
- **PostgreSQL**
- **Postman**

---

##  Getting Started
### 1. Open in IDE

- Open the project folder in IntelliJ or VS Code.
- Ensure that Maven dependencies in `pom.xml` are correctly installed.

### 2. Configure PostgreSQL

- Created a custom database named **AramisUserDatabase**.
- Used pgAdmin to set up a table `UserInformation` with matching fields from the `UserInformation` entity.
- Made necessary configurations in the `application.properties` file to connect Spring Boot to PostgreSQL.

### 3. Run the Application

- Run the Spring Boot application locally (port 8080).
- Once the application is live, you can begin testing endpoints via Postman.

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

![Screenshot 2025-07-04 144412](https://github.com/user-attachments/assets/f3c678b3-8788-450c-acf5-9e188590a20d)

![Screenshot 2025-07-04 144437](https://github.com/user-attachments/assets/cbbef1b5-27a2-45ef-9ae7-1cede4047e2b)

![Screenshot 2025-07-04 144505](https://github.com/user-attachments/assets/6a9b0091-4f79-420d-b5c9-a1479e85143b)


---

### My Contributions and Learning

To complete this project, I independently set up the **AramisUserDatabase**, wrote RESTful API endpoints using Spring Boot, and created the full backend logic for managing user records.

Through this experience, I learned how to:

- Create structured backend logic using service and controller layers.
- Set up a PostgreSQL database from scratch to mirror entity fields.
- Test and verify API functionality using Postman collections.
- Debug issues related to data persistence and HTTP request handling.

I would like to sincerely thank **Mrs. Apeksha Mahale**, my mentor, for her guidance throughout the process. Her detailed instructions helped me stay on track, while also allowing room for me to explore and resolve issues independently.

---

### Learning Outcome:

- Learned to perform complete CRUD operations in a backend environment.
- Gained hands-on experience using Spring Boot, Maven, PostgreSQL, and Postman.
- Learned to reverse-engineer databases and generate JPA entities.
- Understood how to organize Java classes into model, repository, controller, and service layers.

---

## Author

**Tanisha Ravindran**  
Built and modified this application as part of my learning experience and onboarding at **Alstom**.

Student at Iowa State University | Alstom Intern

---

## License

This project was built for educational purposes.

