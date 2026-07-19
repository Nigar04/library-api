package com.nigar.libraryapi.controller;

import com.nigar.libraryapi.entity.Book;
import com.nigar.libraryapi.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nigar.libraryapi.dto.BookDto;

import java.util.List;

@RestController

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks();
    }
}
