package com.example.repository;

import com.example.classes.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface toDoRepo extends JpaRepository<ToDo, Long> {

    //void deleteByidTodo(Long idTodo);
    ToDo findByidtodo(Long idTodo);
}
