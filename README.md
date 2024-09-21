# Employee Management System

## Overview

The Employee Management System is a Spring Boot application designed to manage and display employee information within a company. This project provides a simple and efficient way to keep track of employee details, ensuring that the information is easily accessible and manageable.

## Features

- **Display Employees**: View a list of all employees in the company.
- **RESTful API**: Exposed endpoints to interact with the employee data.
- **Spring Boot**: Utilizes the Spring Boot framework for rapid development and deployment.
- **Thymeleaf**: Integrated with Thymeleaf for server-side rendering of web pages.
- **Spring Data and JPA**: Simplifies data access and manipulation by providing a consistent and easy-to-use framework for working with various data stores, including relational databases, NoSQL databases, and more. It leverages Spring Data JPA to offer powerful repository abstractions, reducing boilerplate code and enabling developers to focus on business logic.
- **Spring MVC**: A robust framework for building web applications using the Model-View-Controller (MVC) design pattern. It facilitates the development of flexible and loosely coupled web applications by separating the application logic (Model), user interface (View), and control flow (Controller). Spring MVC integrates seamlessly with other Spring components, making it a popular choice for developing scalable and maintainable web applications.

## Endpoints

- **GET `/employees`**: Retrieve a list of all employees.
  - **GET `/employees/list`**: list employees.
  - **GET `/employees/showFormForAdd`**: show form to register a newly employed member of staff.
  - **GET `/employees/showFormForUpdate`**: show form to update an employee.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   
   ```
2. Navigate to the project directory:
   ```bash
   cd employee-management-system
   
   ```
3. Build the project:
   ```bash
   mvn clean install
   
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   
   ```

## Usage

Once the application is running, you can access the list of employees by navigating to `http://localhost:8080/employees` in your web browser or by making a GET request to the `/employees` endpoint.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

<p>&copy; 2024 Oluwafisayomi Folaranmi. All rights reserved.</p>


