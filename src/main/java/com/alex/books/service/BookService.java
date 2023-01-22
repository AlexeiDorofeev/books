package com.alex.books.service;

import com.alex.books.entities.Book;
import com.alex.books.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> {
            throw new BookNotFoundException(String.format("Book with id %s not found", id ));
        });
    }
}

