package com.springboot.quickstart.dao;

import com.springboot.quickstart.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"spring boot 实现",88.7));
        books.add(new Book(2,"spring boot",98.7));
        books.add(new Book(3,"spring boot",89.7));
        return books;
    }
}
