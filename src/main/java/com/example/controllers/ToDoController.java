package com.example.controllers;

import com.example.DTOS.AddToDo;
import com.example.DTOS.GetTodo;
import com.example.DTOS.UpdateTodo;
import com.example.services.ToDoService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowCredentials = "true", origins = "http://localhost:63575")
public class ToDoController {



    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @GetMapping("/getAllTodos")
    public ResponseEntity getAllTodos(){

        List<GetTodo> toDoList = toDoService.getAllTodos();
        System.out.println(toDoList);
        return new ResponseEntity<>(toDoList, HttpStatusCode.valueOf(200));
    }

    @PostMapping("/addTodo")
    public ResponseEntity addTodo(@RequestBody AddToDo addToDo){
        System.out.println("okkdkodpko");
        toDoService.AddTodo(addToDo);
        return new ResponseEntity<>("todo added successfully", HttpStatusCode.valueOf(201));
    }



    @PutMapping("/updateTodo")
    public ResponseEntity updateTodo(@RequestBody UpdateTodo updateTodo){
        System.out.println(updateTodo.getDescription());
        toDoService.UpdateTodo(updateTodo);
        return new ResponseEntity<>("todo updated successfully", HttpStatusCode.valueOf(201));
    }

    @PutMapping("/DeleteTodo/{idTodo}")
    public ResponseEntity deleteTodo(@PathVariable("idTodo") Long idTodo){

        toDoService.DeleteTodo(idTodo);
        return new ResponseEntity<>("todo deleted successfully", HttpStatusCode.valueOf(200));
    }


}
