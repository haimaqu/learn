package com.example.learndao.dao;

import com.example.learndao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {

}
