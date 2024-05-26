package com.codewithhusam.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codewithhusam.Repos.BookRepository;

import com.codewithhusam.Entities.Book;

import java.util.List;

public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books/")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    // C`R`UD
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookRepository.findById(id).get();
    }

    // `C`RUD
    @PostMapping("/books/")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // CR`U`D
    @PostMapping("/books/")
    public Book updateBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // CRU`D`
    @DeleteMapping("/books/{@id}")
    public void deleteBook(@PathVariable("id") int id) {
        bookRepository.deleteById(id);
    }

}
