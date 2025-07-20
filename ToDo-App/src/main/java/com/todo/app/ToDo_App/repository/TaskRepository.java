package com.todo.app.ToDo_App.repository;

import com.todo.app.ToDo_App.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> // <Task, Long> is of <entity, type of primary key>
{

}
