package com.magila;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotesRepository extends JpaRepository<Notes, Long> {
    
    Notes findByTitle(final String title);
}
