package com.rohit.bs.dao;

import com.rohit.bs.dto.Book;
import java.util.List;

public interface BookDao {
	
	public void addBook(Book book);
	
	public void updateBook(int id,Book book);
	
	public void deleteBook(int id);
	
	public Book searchBook(int id);
	
	public List<Book> getAllBooks();
}
