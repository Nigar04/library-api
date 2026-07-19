package com.nigar.libraryapi.repository;

import com.nigar.libraryapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
