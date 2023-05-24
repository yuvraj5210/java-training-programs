package com.bookApp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookApp.model.Book;
import com.bookApp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	private static final String Integer = null;

	@Override
	public List<Book> getAll() {
		List< Book> book=BookDetails.showBooks();
		return book;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> books=BookDetails.showBooks();
		List<Book> getAuthor=books.stream()
				.filter(getauthor->getauthor.getAuthor().equals(author))
						.collect(Collectors.toList());
				return getAuthor;
	}

	@Override
	public Optional<Book> getById(Integer bookId) {
		
		List<Book> books=BookDetails.showBooks();
		
		Optional<Book> getById=books.stream()
				.filter(getid->((Integer)getid.getBookId()).equals((Integer)bookId))
				.findAny();
		return getById;
	}


	
}	
	

