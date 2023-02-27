package com.example.classes;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Table(name="todos")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtodo", nullable = false)
    private Long idtodo;


    @Column(name="description", nullable = false)
    private String description;

    @Column(name="creation_date", nullable = false)
    @CreatedDate
    private Date creation_date = new Date();

    public ToDo() {
    }

    public ToDo(String description) {
        this.description = description;
    }

    public ToDo(Long id,String description) {
        this.description = description;
        this.idtodo = id;
    }




    public Long getIdtodo() {
        return idtodo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public void setIdtodo(Long idtodo) {
        this.idtodo = idtodo;
    }

}
