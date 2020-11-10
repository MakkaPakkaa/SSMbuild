package com.hry.dao;

import com.hry.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
//    查询一本书
    Books queryBookById(@Param( "bookID") int id);
//    增加一本书
    int addBook(Books book);
//    删除一本书
    int deleteBookById(int id);
//    更新一本书
    int updateBook( Books books);
//    查询所有书
    List <Books> queryAllBooks();
}
