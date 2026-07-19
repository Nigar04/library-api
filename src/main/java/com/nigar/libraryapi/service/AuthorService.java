package com.nigar.libraryapi.service;

import com.nigar.libraryapi.entity.Author;
import com.nigar.libraryapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import com.nigar.libraryapi.dto.AuthorDto;
import java.util.stream.Collectors;

import java.util.List;

@Service

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(author -> new AuthorDto(
                        author.getId(),
                        author.getFullName()
                ))
                .collect(Collectors.toList());
    }
}
