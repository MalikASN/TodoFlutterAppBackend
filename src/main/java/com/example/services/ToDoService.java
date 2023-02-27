package com.example.services;


import com.example.DTOS.AddToDo;
import com.example.DTOS.GetTodo;
import com.example.DTOS.ToDoMapper;
import com.example.DTOS.UpdateTodo;
import com.example.classes.ToDo;
import com.example.repository.toDoRepo;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {



    private final toDoRepo tdrp;
    private ToDoMapper toDoMapper;

    public ToDoService(toDoRepo tdrp, ToDoMapper toDoMapper) {
        this.tdrp = tdrp;
        this.toDoMapper = toDoMapper;
    }


    public List<GetTodo> getAllTodos(){
        return tdrp.findAll().stream().map(toDoMapper::toTodoDto).collect(Collectors.toList());
    }

    public void AddTodo( AddToDo addTodo){
        ToDo toDo =toDoMapper.toTodoAdd(addTodo);
        tdrp.save(toDo);
    }

    public void UpdateTodo( UpdateTodo updateTodo){

        ToDo toDo =toDoMapper.toTodoUpdate(updateTodo);
        ToDo fetchedtodo =tdrp.findByidtodo(toDo.getIdtodo());
        fetchedtodo.setDescription(toDo.getDescription());
        tdrp.save(fetchedtodo);
    }

    public void DeleteTodo( Long id){

        tdrp.deleteById(id);
    }
}
