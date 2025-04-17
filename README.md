This is a simple Spring Boot CRUD application that manages employee data through RESTful APIs. It allows you to onboard, retrieve, update, and delete employee records.

Features
Onboard New Employee
POST /emp/api/onboard
Accepts an Employee JSON object and adds it to the system.

Get Employee by ID
GET /emp/api/getEmployee/{id}
Retrieves a single employee based on the provided ID.

Get All Employees
GET /emp/api/getAllEmployee
Returns a list of all employees.

Update Employee
PUT /emp/api/update
Updates the details of an existing employee.

Delete Employee by ID
DELETE /emp/api/delete/{id}
Removes an employee from the system based on ID.

Tech Stack
--> Spring Boot
--> Spring Web
--> Java 17+

Maven/Gradle (depending on your setup)

Structure
controllers - Exposes REST APIs

services - Handles business logic

entities - Represents the Employee model

Running the Application
Clone the repository

Build using Maven/Gradle

Access APIs via Postman or your preferred client
