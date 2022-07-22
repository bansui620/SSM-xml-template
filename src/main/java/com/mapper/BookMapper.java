package com.mapper;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    /**查询所有书
     * @return
     */
    List<Books> queryAllBook();



    /**
     * 查询一本书
     * @param id
     * @return
     */
    Books queryBookById(@Param("bookId") int id);
}
