package com.example.DTOS;

import com.example.classes.ToDo;
import org.springframework.stereotype.Service;

@Service
public class ToDoMapper {

    public GetTodo toTodoDto(ToDo toDo) {
        return new GetTodo(toDo.getIdtodo(),toDo.getDescription(), toDo.getCreation_date());
    }

    public ToDo toTodoAdd(AddToDo addToDo) {
        return new ToDo( addToDo.getDescription());
    }

    public ToDo toTodoUpdate(UpdateTodo updateTodo) {
        return new ToDo(updateTodo.getId(), updateTodo.getDescription());
    }
}
