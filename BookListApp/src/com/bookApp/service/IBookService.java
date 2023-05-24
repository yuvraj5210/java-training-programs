package com.bookApp.service;

import java.util.List;
import java.util.Optional;

import com.bookApp.model.*;
public interface IBookService
{
	List<Book> getAll();
	List<Book> getByAuthor(String author);
	Optional<Book> getById(Integer bookId);
}
