package com.example.learn.learn.repository;

import com.example.learn.learn.dao.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
