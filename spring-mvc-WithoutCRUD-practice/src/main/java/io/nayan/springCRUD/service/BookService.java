package io.nayan.springCRUD.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.nayan.springCRUD.model.Book;

@Service
public class BookService {
	List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("1","Core Java","Java", "Learn Java in 24 days", 55.60),
			new Book("2","J2EE","Java", "Learn Servlet and JSP in 24 days", 59.45)));
	
	
	@Transactional
	public List<Book> getAllBooks()
	{
		return bookList;
	}
	
	@Transactional
	public Book getBookById(String id)
	{
		return bookList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	@Transactional
	public void addBook(Book book)
	{
		bookList.add(book);
		
	}
	
	@Transactional
	public void updateBook(Book book, String id)
	{
		for(int i=0;i<bookList.size();i++)
		{ 
			if(bookList.get(i).getId().equals(id))
			{
				bookList.set(i, book);
			}
			
		}
			
		
	}
	
	@Transactional
	public void removeBook(String id)
	{
		for(Iterator<Book> itr=bookList.iterator();itr.hasNext();)
		{ 
			if(itr.next().getId().equals(id))
			{
				itr.remove();
			}
			
		}
		
	}

	
	
	
	
}
