package com.bookApp.model;

public class Book
{
	private String author;
	private double price;
	private String tittle;
	private Integer bookId;
	
	// constructor
	public Book(String author, double price, String tittle, Integer bookId) {
		super();
		this.author = author;
		this.price = price;
		this.tittle = tittle;
		this.bookId = bookId;
	}

	// getters and setters 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}



	// to string 
	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", tittle=" + tittle + ", bookId=" + bookId + "]";
	}



}
