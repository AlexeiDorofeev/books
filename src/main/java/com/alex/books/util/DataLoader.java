package com.alex.books.util;

import com.alex.books.entities.Book;
import com.alex.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void loadData() {
        List<Book> books = Arrays.asList(
            new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", 100 ),
            new Book(2L,"The Catcher in the Rye", "J.D. Salinger", 44),
            new Book(3L, "Moby-Dick", "Herman Melville", 55),
            new Book(4L, "To Kill a Mockingbird", "Harper Lee", 70),
            new Book(5L, "The Lord of the Rings", "J.R.R. Tolkien", 8)
        );
     //   bookRepository.saveAll(books);
    }
}
