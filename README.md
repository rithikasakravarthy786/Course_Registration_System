#Course Registration System
##About the Project

This is a full-stack Course Registration System developed using Spring Boot for the backend and HTML, CSS, and JavaScript for the frontend.
The main objective of this project is to allow users to view available courses, register for courses, and manage enrollments through a simple and user-friendly interface.

This project helped me understand how frontend and backend systems communicate using REST APIs and how a complete end-to-end application is built.

Technologies Used
Backend

Java

Spring Boot

Spring Data JPA

REST APIs

MySQL

Maven

Frontend

HTML

CSS

JavaScript

Key Features

Display list of available courses

User course registration and enrollment

Backend REST APIs for course and enrollment management

Frontend integration using JavaScript

Clean layered backend architecture (Controller, Service, Repository)

Persistent data storage using MySQL

Application Flow

The frontend displays available courses to users

Users can register and enroll in courses through the UI

Frontend sends requests to backend REST APIs

Backend processes requests and updates the database

Responses are returned and displayed dynamically on the UI

Database Design

The application uses the following tables:

users

courses

enrollments

These tables are connected using proper JPA relationships to maintain data consistency.

API Endpoints
Course APIs

GET /courses – Get all available courses

POST /courses – Add a new course

Enrollment APIs

POST /enroll – Enroll a user in a course

GET /enrollments/{userId} – View enrolled courses for a user

How to Run the Project

Clone the repository from GitHub

Create a MySQL database (example: course_db)

Update database credentials in application.properties

Run the backend using an IDE or mvn spring-boot:run

Open the frontend HTML files in a browser

Interact with the application through the UI

Learning Outcome

Through this project, I learned:

How to build full-stack applications

How to design and consume REST APIs

How frontend and backend communicate using HTTP and JSON

How to structure a Spring Boot project properly

How to use Git and GitHub for version control
