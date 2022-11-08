package com.aga.app.notes.Note.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tasks")
public class Note {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Field must not be blank")
    private String title;

    private String description;

    public Note() {
    }

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getTitle() {
        return title;
    }

    void setTitle(final String title) {
        this.title = title;
    }

    String getDescription() {
        return description;
    }

    void setDescription(final String description) {
        this.description = description;
    }
}
