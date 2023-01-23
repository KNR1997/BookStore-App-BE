package com.bookstore.springboot.library.service;

import com.bookstore.springboot.library.dao.BookRepository;
import com.bookstore.springboot.library.dto.BookTitleAuthorDTO;
import com.bookstore.springboot.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookTitleAuthorDTO> getBookTitleAuthor() {
        return bookRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    private BookTitleAuthorDTO convertEntityToDTO (Book book) {
        BookTitleAuthorDTO bookTitleAuthorDTO = new BookTitleAuthorDTO();
        bookTitleAuthorDTO.setTitle(book.getTitle());
        bookTitleAuthorDTO.setAuthor(book.getAuthor());

        return bookTitleAuthorDTO;
    }
}
