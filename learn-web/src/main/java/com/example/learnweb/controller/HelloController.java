package com.example.learnweb.controller;

import com.example.learndao.entity.Book;
import com.example.learnservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SpringBoot多模块脚手架
 * 参考链接：
 * https://www.hangge.com/blog/cache/detail_2833.html#
 * https://blog.csdn.net/zcf980/article/details/83040029
 * https://www.cnblogs.com/jcjssl/p/9380309.html
 *
 */
@RestController
public class HelloController {

    @Autowired
    BookService bookService;

    @GetMapping("test")
    public List<Book> test() {
        return bookService.allBooks();
    }



}