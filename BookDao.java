package com.dao;

import java.util.List;

import models.com.Books;

public interface BookDao {
	
	List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);

}
