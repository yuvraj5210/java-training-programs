package com.bookapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Streams;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookRepository.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteBook(bookId);
	}
	

	@Override
	public List<Book> getAll() {
		return bookRepository.getAll();
		
	}

	@Override
	public Book getById(int bookId) {
		return bookRepository.getById(bookId);
		
		
	}

	@Override
	public List<Book> getPriceLessThan(double price) {
		return bookRepository.getPriceLessThan(price);
		
	}

	@Override
	public List<Book> getByTitleContaining(String title) {
		return bookRepository.getByTitleContaining(title);
	}

	@Override
	public List<Book> getByAuthorStarting(String author) {
		return bookRepository.getByAuthorStarting(author);
		
	}

	

}
