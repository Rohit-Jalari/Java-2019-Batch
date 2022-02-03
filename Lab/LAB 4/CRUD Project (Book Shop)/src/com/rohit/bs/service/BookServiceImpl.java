package com.rohit.bs.service;

import com.rohit.bs.dto.Book;
import com.rohit.bs.dao.BookDao;
import com.rohit.bs.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService 
{
	BookDao bookDao = new BookDaoImpl();
	@Override
	public void addBook(Book book)
	{
		bookDao.addBook(book);		
	}
	@Override
	public void updateBook(int id, Book book)
	{
		bookDao.updateBook(id,book);
	}
	@Override
	public void deleteBook(int id)
	{
		bookDao.deleteBook(id);
	}
	@Override
	public Book searchBook(int id)
	{
		return bookDao.searchBook(id);
	}
	@Override
	public List<Book> getAllBooks()
	{
		return bookDao.getAllBooks();
	}
}
