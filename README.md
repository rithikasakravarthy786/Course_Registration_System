# Course Registration System

## About the Project
This is a full-stack Course Registration System developed using Spring Boot for the backend and HTML, CSS, and JavaScript for the frontend.  
The main goal of this project is to allow users to view available courses, register for courses, and manage enrollments through a simple web-based interface.

This project helped me gain hands-on experience in full-stack development, REST API integration, database design, and frontend–backend communication.

---

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- MySQL
- Maven

### Frontend
- HTML
- CSS
- JavaScript

---

## Key Features
- Display available courses to users
- User registration and course enrollment
- Backend REST APIs for course and enrollment management
- Frontend integration using JavaScript
- Clean layered architecture (Controller, Service, Repository)
- Data persistence using MySQL

---

## Application Logic
A course registration flow works as follows:
- Available courses are fetched from the backend and displayed on the frontend
- Users select and register for courses
- Frontend sends requests to backend REST APIs
- Backend validates and processes the enrollment
- Enrollment details are stored in the database and returned as a response

---

## Database Design
The application uses the following tables:
- users
- courses
- enrollments

These tables are connected using proper JPA relationships to ensure data consistency.

---

## API Endpoints

### Course APIs
- GET /courses – Fetch all available courses
- POST /courses – Add a new course

### Enrollment APIs
- POST /enroll – Enroll a user in a course
- GET /enrollments/{userId} – View enrolled courses for a user


---

## Learning Outcome
Through this project, I learned:
- How to build full-stack applications using Spring Boot
- How to design and consume RESTful APIs
- How frontend and backend communicate using HTTP and JSON
- How to structure a Spring Boot project properly
- How to use Git and GitHub for version control



