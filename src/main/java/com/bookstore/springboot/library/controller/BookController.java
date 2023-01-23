package com.bookstore.springboot.library.controller;

import com.bookstore.springboot.library.dto.BookTitleAuthorDTO;
import com.bookstore.springboot.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book-Title-Author")
    public List<BookTitleAuthorDTO> getBookTitleAuthor() {
        return bookService.getBookTitleAuthor();
    }
}
