package com.hry.service;

import com.hry.pojo.Books;

import java.util.List;

public interface BookService {
    //    查询一本书
    Books queryBookById(int id);
    //    增加一本书
    int addBook(Books book);
    //    删除一本书
    int deleteBookById(int id);
    //    更新一本书
    int  updateBook(Books books);
    //    查询所有书
    List<Books> queryAllBooks();
}
