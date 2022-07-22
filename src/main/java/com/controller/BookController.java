package com.controller;

import com.pojo.Books;
import com.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Books> list(){
        List<Books> books = bookService.queryAllBook();
        System.out.println(books);
        return books;
    }

    @RequestMapping("/find/{id}")
    @ResponseBody
    public Books find(@PathVariable("id") int id){
        return bookService.queryBookById(id);
    }

}
