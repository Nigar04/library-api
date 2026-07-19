package com.nigar.libraryapi.controller;

import com.nigar.libraryapi.entity.Author;
import com.nigar.libraryapi.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nigar.libraryapi.dto.AuthorDto;

import java.util.List;

@RestController

public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAllAuthors();
    }
}
