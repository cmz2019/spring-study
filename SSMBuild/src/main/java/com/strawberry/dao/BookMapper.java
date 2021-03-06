package com.strawberry.dao;

import com.strawberry.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books book);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books book);

    Books queryBookById(@Param("BookID") int id);

    List<Books> queryAllBooks();
}
