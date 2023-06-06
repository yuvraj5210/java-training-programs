package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner{

	@Autowired
	IBookService bookService;
	
	public static void main(String[] args)  {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book=new Book();	
		
		//adding book

//		book.setBookId(1010);
//		book.setBookName("learn jango");
//		book.setAuthor("tom");
//		book.setCategory("tech");
//		book.setPrice(11000.0);
//		bookService.addBook(book);
		
		// updating book
//		bookService.updateBook(108, 9999.0);
		
		// delete book
//	//	bookService.deleteBook(1);
		//bookService.getByTitleContaining("java").stream().forEach(System.out::println);
		bookService.getByTitleContaining("java").stream().forEach(System.out::println);
	//	bookService.getByAuthorStarting("k").stream().forEach(System.out::println);
	//	System.out.println(bookService.getById(108));

	}

}
