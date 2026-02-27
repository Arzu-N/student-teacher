# student-teacher
Multi-module Spring Boot application with Teacher and Student modules using Feign Client for inter-service communication
# Student-Teacher Project

## Overview
This is a **multi-module Spring Boot project** managing **Teacher** and **Student** modules.  
The project demonstrates **inter-module communication using Feign Client**.  
The `teacher` module can request student data from the `student` module for each teacher.

## Modules
- **teacher**: Manages teacher information, supports create, read, and DTO mapping operations.
- **student**: Manages student information and provides endpoints to fetch students by teacher ID.

## Features
- Spring Boot 3.5
- Spring Data JPA for database management
- Feign Client for inter-module requests
- PostgreSQL support
- Lombok to reduce boilerplate code
- MapStruct for DTO mapping
- Springdoc OpenAPI for API documentation

## Requirements
- Java 17+
- Gradle 9.x
- PostgreSQL 15+ (or compatible version)
- Recommended IDE: IntelliJ IDEA

## Getting Started

1. Clone the repository:
   ```bash
   
2. Configure PostgreSQL in each module’s application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/yourdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

3. Build the project:

./gradlew clean build

4. Run the modules:

Teacher module:

./gradlew :teacher:bootRun

Student module:

./gradlew :student:bootRun

5. Access API documentation:

http://localhost:8080/swagger-ui.html (teacher module)

http://localhost:8081/swagger-ui.html (student module)

License

This project is open-source and licensed under the MIT License.
   git clone https://github.com/Arzu-N/student-teacher.git
