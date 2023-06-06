package com.bookapp.repository;

import java.sql.ResultSet;
import java.util.Comparator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Streams;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

@Repository
public class BookRepositoryImpl implements IBookRepository {

	@Autowired
	private JdbcTemplate  jdbcTemplate;

	@Override
	public void addBook(Book book) {

		String sql="insert into book (bookId,tittle,author,price,category) values(?,?,?,?,?)";
		Object[] bookArray= {book.getBookId(),book.getBookName(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(sql,bookArray);
	}

	@Override
	public void updateBook(int bookId, double price) {

		String sql="update book set price=? where bookId=?";
		jdbcTemplate.update(sql,price,bookId);

	}

	@Override
	public void deleteBook(int bookId) {
		String sql="delete from book where bookId=?";
		jdbcTemplate.update(sql, bookId);
	}

	@Override
	public List<Book> getAll() {
		String sql="select * from book";
		//RowMapper<Book> mapper=new BookMapper();
		return jdbcTemplate.query(sql, new BookMapper());
	

	}

	@Override
	public Book getById(int bookId) {
		String sql="select * from book where bookId=?";
		//RowMapper<Book> mapper=new BookMapper();
		return jdbcTemplate.queryForObject(sql, ((ResultSet rs,int rowNum)->{
			Book book=new Book();
			book.setBookId(rs.getInt("bookId"));
			book.setAuthor(rs.getString("author"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			book.setBookName(rs.getString("tittle"));
			return book;
		} ),bookId);


	}

	@Override
	public List<Book> getPriceLessThan(double price) {
		
		String sql="select * from book where price<=?";
		//RowMapper<Book> mapper=new BookMapper();
		return jdbcTemplate.query(sql,new BookMapper(),price);

	}

	@Override
	public List<Book> getByTitleContaining(String title) {
		
		String sql="select * from book where title like ? ";
		//RowMapper<Book> mapper=new BookMapper();
		return jdbcTemplate.query(sql,new BookMapper(),"%"+title+"%");

	}

	@Override
	public List<Book> getByAuthorStarting(String author) {
		String sql="select * from book where author like ? ";
		//RowMapper<Book> mapper=new BookMapper();
		return jdbcTemplate.query(sql,new BookMapper(),author+"%");
		
	}



}
