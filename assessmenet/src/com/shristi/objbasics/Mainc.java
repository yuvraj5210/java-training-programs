package com.shristi.objbasics;

class Book
{
	private String tittle;
	private String author;
	private double price;
	private String category;
	public Book(String tittle, String author, double price)
	{
		super();
		this.tittle = tittle;
		this.author = author;
		this.price = price;
	}
    void getDetails()
    {
    	System.out.println("Tittle Name :"+tittle);
    	System.out.println("Author Name :"+author);
    	System.out.println("Price :"+price);
    	
    	if(price>500.0)
    	{
    		System.out.println("Category : Premium");
    	}
    	else
    	{
    		System.out.println("Category : Standard book");
    	}
    	
    }
	
}
public class Mainc {

	public static void main(String[] args) {

		Book book=new Book("it ends with us ", " yuvraj", 501.0);
		book.getDetails();
	}

}
