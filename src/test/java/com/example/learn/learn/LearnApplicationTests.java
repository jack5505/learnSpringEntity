package com.example.learn.learn;

import com.example.learn.learn.dao.Author;
import com.example.learn.learn.dao.Book;
import com.example.learn.learn.repository.AuthorRepository;
import com.example.learn.learn.repository.BookRepository;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {

    @Autowired AuthorRepository authorRepository;
    @Autowired BookRepository bookRepository;

    @Test
    void contextLoads() {
        authorRepository.findAll();
    }

}
