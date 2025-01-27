package com.example.Book.repository.jpa;

import com.example.Book.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository  extends JpaRepository<Book,Long> {

    Optional< Book> findByTitle(String title);
}
