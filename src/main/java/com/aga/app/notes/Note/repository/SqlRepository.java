package com.aga.app.notes.Note.repository;

import com.aga.app.notes.Note.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlRepository extends JpaRepository<Note, Integer>, NoteRepository {
}
