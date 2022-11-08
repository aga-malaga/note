package com.aga.app.notes.Note.Controller;

import com.aga.app.notes.Note.model.Note;
import com.aga.app.notes.Note.repository.NoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
class NoteController {
    private final NoteRepository repository;

    NoteController(final NoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/notes")
    List<Note> showAll(){
        return ResponseEntity.ok(repository.findAll()).getBody();
    }

    @GetMapping("notes/id")
    ResponseEntity<Note> showNote(@PathVariable Integer id){
        return repository.findById(id)
                .map(note -> ResponseEntity.ok(note))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("notes/id")
    void delete(@PathVariable Integer id){
        if (!repository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            repository.deleteById(id);
        }
    }







}
