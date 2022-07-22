package com.service;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    /**查询所有书
     * @return
     */
    List<Books> queryAllBook();

    /**
     * 查询一本书
     * @param id
     * @return
     */
    Books queryBookById(int id);
}
