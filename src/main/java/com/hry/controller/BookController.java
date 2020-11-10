package com.hry.controller;

import com.hry.pojo.Books;
import com.hry.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //    controller层调用业务层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
//    查询全部书籍，并跳转页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
//    跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddpaper(){

        return "addBook";
    }
//    新增书籍请求跳转
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
//    跳转到修改页面
    @RequestMapping("/toUpdataBook")
    public String toUpdataBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks",books);
        return "updataBook";
    }
//修改书籍
    @RequestMapping("/updataBook")
    public String updataBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

//    删除书籍
    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
