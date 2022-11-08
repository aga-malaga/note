package com.aga.app.notes.Note.repository;

import com.aga.app.notes.Note.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteRepository {
    List<Note> findAll();

    Optional<Note> findById(Integer id);

    boolean existsById(Integer id);

    void deleteById(Integer id);

    Note save(Note entity);

}
