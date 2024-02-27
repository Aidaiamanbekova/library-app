package com.example.demo.services;


import com.example.demo.dto.BookDTO;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDTO> findBooks();

    Optional<BookDTO> findBookByID(Long id);
}