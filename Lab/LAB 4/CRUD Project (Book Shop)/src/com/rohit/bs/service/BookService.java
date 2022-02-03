package com.rohit.bs.service;

import java.util.List;

import com.rohit.bs.dto.Book;

public interface BookService {
	
	public void addBook(Book book);
	
	public void updateBook(int id,Book book);
	
	public void deleteBook(int id);
	
	public Book searchBook(int id);
	
	public List<Book> getAllBooks();

}
