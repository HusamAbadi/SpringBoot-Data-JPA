package com.codewithhusam.Entities;

import jakarta.persistence.*;

@Entity
public class BookGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Because of auto_increment in mysql
    private long bookId;
    private long genreId;

    public long getId() {
        return bookId;
    }

    public void setId(long bookId) {
        this.bookId = bookId;
    }

    public long getBookId() {
        return bookId;
    }

    public long getGenreId() {
        return genreId;
    }
}
