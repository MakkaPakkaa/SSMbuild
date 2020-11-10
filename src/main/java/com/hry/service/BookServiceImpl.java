package com.hry.service;

import com.hry.dao.BookMapper;
import com.hry.pojo.Books;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional
public class BookServiceImpl implements BookService {
    //service层调dao层 组合dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);

    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);

    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);

    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);

    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();

    }
}
