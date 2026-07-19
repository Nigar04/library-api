package com.nigar.libraryapi.repository;

import com.nigar.libraryapi.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
