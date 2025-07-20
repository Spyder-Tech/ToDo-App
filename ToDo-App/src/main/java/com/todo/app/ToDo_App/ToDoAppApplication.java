package com.todo.app.ToDo_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoAppApplication
{
	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

}

/*
from https://start.spring.io/ -> I used
Spring Web
	Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
Spring Data JPA SQL
	Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
MySQL Driver SQL
	MySQL JDBC driver.
Lombok Developer Tools
	Java annotation library which helps to reduce boilerplate code.
Thymeleaf Template Engines
	A modern server-side Java template engine for both web and standalone environments.
	Allows HTML to be correctly displayed in browsers and as static prototypes.
 */