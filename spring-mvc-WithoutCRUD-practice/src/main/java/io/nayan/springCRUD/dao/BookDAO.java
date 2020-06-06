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
	
	
	/*public Book getBookById(String id)
	{
		return bookList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}*/
	
	/*
	public void addBook(Book book)
	{
		bookList.add(book);
		
	}
	
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

	
*/	
	
	
}
