package com.springboot.rabbit.aqp.book;

/**
 * @Author: yhy
 * @Date: 2018/7/27 16:04
 * @Version 1.0
 */
public class Book {
    private String books;
    private String author;

    public Book() {
    }

    public Book(String books, String author) {
        this.books = books;
        this.author = author;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "books='" + books + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
