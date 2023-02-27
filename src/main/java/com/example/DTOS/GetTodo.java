package com.example.DTOS;

import java.util.Date;

public class GetTodo {
    private Long id;
    private String description;
    private Date creation_date;

    public GetTodo(Long idtodo, String description, Date creation_date) {
        this.id =idtodo;
        this.description =description;
        this.creation_date =creation_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
