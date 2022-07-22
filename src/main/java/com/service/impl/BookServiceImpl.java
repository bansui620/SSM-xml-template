package com.service.impl;

import com.mapper.BookMapper;
import com.pojo.Books;
import com.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    //service 调持久层（组合）
    @Autowired
    private BookMapper bookMapper;

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }


    public Books queryBookById(int id){
        return bookMapper.queryBookById(id);
    }
}
