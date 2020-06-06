package io.nayan.springCRUD.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.nayan.springCRUD.dao.BookDAO;
import io.nayan.springCRUD.model.Book;

@Service
public class BookService {
	
	@Autowired
	BookDAO bookDao;
	
	List<Book> bookList = new ArrayList<>();
	@Transactional
	public List<Book> getAllBooks()
	{
		bookList=bookDao.getAllBooks();
		return bookList;
	}
	
	@Transactional
	public Book getBookById(Integer id)
	{
		return bookDao.getBookById(id);
	}
	
	@Transactional
	public void addBook(Book book)
	{
		bookDao.addBook(book);
		
	}
	
	@Transactional
	public void updateBook(Book book, Integer id)
	{
		bookDao.updateBook(book, id);
		
	}
	
	@Transactional
	public void removeBook(Integer id)
	{
		bookDao.removeBook(id);
	}

	
	
	
	
}
