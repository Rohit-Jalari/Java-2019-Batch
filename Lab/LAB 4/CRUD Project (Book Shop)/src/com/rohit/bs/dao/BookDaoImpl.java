package com.rohit.bs.dao;

import com.rohit.bs.util.DbUtil;
import com.rohit.bs.dto.Book;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;


public class BookDaoImpl implements BookDao
{
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public void addBook(Book book) {

		String query = "INSERT INTO `bookrecord`(`Book Name`, `Author(s)`, `Edition`,`Price`) VALUES (?,?,?,?)";

		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getEdition());
			ps.setString(4, book.getPrice());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void updateBook(int id, Book book)
	{
		String query = "UPDATE `bookrecord` SET `Book Name` = ?, `Author(s)` = ?, `Edition` = ?,`Price`= ? WHERE `ID` = ?";

		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getEdition());
			ps.setString(4, book.getPrice());
			ps.setInt(5,  id);

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void deleteBook(int id)
	{
		String query = "DELETE from `bookrecord` WHERE `ID` = ?";
		
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Book searchBook(int id)
	{
		Book book = new Book();
		String query = "SELECT * FROM `bookrecord` WHERE `ID` = ?";

		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				book.setName(rs.getString("Book Name"));
				book.setAuthor(rs.getString("Author(s)"));
				book.setEdition(rs.getString("Edition"));
				book.setPrice(rs.getString("Price"));
			} else {
				book = null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
	@Override
	public List<Book> getAllBooks()
	{
		List<Book> bookArray = new ArrayList<>();
		String query = " SELECT * FROM `bookrecord`";
		
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next())
			{
				Book book = new Book();
				book.setId(rs.getInt("ID"));
				book.setName(rs.getString("Book Name"));
				book.setAuthor(rs.getString("Author(s)"));
				book.setEdition(rs.getString("Edition"));
				book.setPrice(rs.getString("Price"));
				
				bookArray.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookArray;
	}
}
