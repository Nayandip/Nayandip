package io.nayan.springCRUD.dao;
	
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.nayan.springCRUD.model.Book;

@Repository
public class BookDAO {
	
	@Autowired
	private EntityManager entityManager;

	public List<Book> getAllBooks()
	{
		Session session = entityManager.unwrap(Session.class);
		Query<Book> query = session.createQuery("from Book",Book.class);
		List<Book> bookList =query.getResultList();
		
		return bookList;
	}
	
	
	public Book getBookById(Integer id)
	{
		Session session = entityManager.unwrap(Session.class);
		
		return session.get(Book.class,id);
		
	}
	
	
	public void addBook(Book book)
	{
		Session session = entityManager.unwrap(Session.class);
		session.save(book);
		
		
	}
	
	public void updateBook(Book book, Integer id)
	{

		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
			
		
	}
	
	
	public void removeBook(Integer id)
	{

		Session session = entityManager.unwrap(Session.class);
		
		Book book = session.get(Book.class,id);
		
		if(book!=null)
		{
			session.delete(book);
		}
		
	}
		
		
		
	}