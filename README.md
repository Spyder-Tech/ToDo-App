To-Do List Application

This is a simple To-Do List web application built using Spring Boot and Thymeleaf. It demonstrates how to create, read, update, and delete (CRUD) todo items with a MySQL database, leveraging modern Java development tools and best practices.

Features

    Add new todo items
    View list of todos
    Mark todos as completed
    Update existing todos
    Delete todos
    Responsive UI styled with Bootstrap

Technologies & Tools

    Spring Boot (2.x or 3.x)
    JPA (Hibernate) for ORM
    MySQL as the database
    Lombok to reduce boilerplate code
    Thymeleaf for server-side rendering
    Bootstrap CSS for styling

Prerequisites

    Java 11 or higher installed
    MySQL Server running
    IntelliJ IDEA (recommended)
    Maven or Gradle (depending on project setup)
    Basic knowledge of Java, Spring Boot, and SQL

Setup Instructions
1. Clone the Repository

          

        git clone https://github.com/yourusername/todo-list-springboot.git
        cd todo-list-springboot

      

2. Configure Database

Create a MySQL database:

          

    CREATE DATABASE todo_db;

      

Update your application.properties (or application.yml) with your database credentials:

          

    spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?useSSL=false&serverTimezone=UTC
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

      

3. Build and Run

Using Maven:

          

    mvn clean install
    mvn spring-boot:run

      

Or using Gradle:

          

    ./gradlew build
    ./gradlew bootRun

      

Usage

Open your browser and navigate to:

          

http://localhost:8080

      

You will see the Todo List interface where you can add, view, update, and delete todo items.


      

License

This tutorial project is for educational purposes. Feel free to modify and extend it.

Acknowledgments

    Spring Boot and Thymeleaf documentation
    Bootstrap CSS framework
    Lombok library

Contact


Enjoy building your Todo List app with Spring Boot!
