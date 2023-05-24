package com.bookApp.util;

import java.util.Arrays;
import java.util.List;

import com.bookApp.model.*;

public class BookDetails 
{
	public static List<Book> showBooks()
	{
				
		
		List<Book> books=Arrays.asList(
				new Book("kathy",200.0,"java",1),
				new Book("p c sharma",200.0,"python",2),
				new Book("amogh",200.0,"mongoDB",3),
				new Book("yuvraj",200.0,"sql",4),
				new Book("hello",200.0,"c++",5)
				);
		return books;
	}

}
