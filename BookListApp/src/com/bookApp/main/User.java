package com.bookApp.main;

import java.util.*;

import com.bookApp.model.Book;
import com.bookApp.service.BookServiceImpl;
import com.bookApp.service.IBookService;
public class User 
{
	public static void main(String[] args) {		

		Scanner sc=new Scanner(System.in);
		IBookService bookService=new BookServiceImpl();
		List<Book> books=bookService.getAll();
		for(Book book:books)
		{
			System.out.println(book);
		}
		System.out.println("________by  author_______");
		books =bookService.getAll();
		List<Book> bookByAuthor=bookService.getByAuthor("yuvraj");
		for(Book book:books)
		{
			System.out.println(book);
		}
		
		System.out.println("_______by id__________");
		books=bookService.getAll();
		Optional<Book> bookById=bookService.getById(1);
		System.out.println(bookById);



	}

}
