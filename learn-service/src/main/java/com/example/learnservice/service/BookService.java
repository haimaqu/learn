package com.example.learnservice.service;

import com.example.learndao.dao.BookDao;
import com.example.learndao.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> allBooks() {
        return bookDao.findAll();
    }
}