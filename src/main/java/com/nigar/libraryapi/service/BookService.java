package com.nigar.libraryapi.service;

import com.nigar.libraryapi.entity.Book;
import com.nigar.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import com.nigar.libraryapi.dto.BookDto;
import java.util.stream.Collectors;

import java.util.List;

@Service

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(book -> new BookDto(
                        book.getId(),
                        book.getTitle()
                ))
                .collect(Collectors.toList());
    }
}
