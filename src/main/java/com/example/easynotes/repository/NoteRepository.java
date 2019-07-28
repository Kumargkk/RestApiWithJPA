package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


 //Create Note repository to access Notes Data in DB

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
