package com.bookapp.repository;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookRepository {

	
	void addBook(Book book);
	void updateBook(int bookId,double price);
	void deleteBook(int bookId);
	
	
	List<Book> getAll();
	Book getById(int bookId) ;
	List<Book> getPriceLessThan(double price);
	List<Book> getByTitleContaining(String title);
	List<Book> getByAuthorStarting(String author);
	
	
}
