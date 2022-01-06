package com.example.learn.learn.repository;

import com.example.learn.learn.dao.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
