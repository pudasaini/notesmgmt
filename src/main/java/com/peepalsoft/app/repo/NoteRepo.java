package com.peepalsoft.app.repo;

import com.peepalsoft.app.entity.notes.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note,Integer> {
}
