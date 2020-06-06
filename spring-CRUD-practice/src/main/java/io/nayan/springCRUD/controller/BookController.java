package io.nayan.springCRUD.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nayan.springCRUD.model.Book;
import io.nayan.springCRUD.service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public String defaultMethod()
	{
		return "Hello!! This is book world !!!";
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable Integer id)
	{
		return bookService.getBookById(id);
	}
	
	
	@PostMapping(path="/book", consumes="application/json")
	public void addBook(@RequestBody Book book)
	{
		bookService.addBook(book);
		
	}
	
	@PutMapping(path="/book/{id}",consumes="application/json")
	public void updateBook(@RequestBody Book book, @PathVariable Integer id)
	{
		bookService.updateBook(book, id);;
	}
	
	@DeleteMapping("/book/{id}")
	public void removeBook(@PathVariable Integer id)
	{
		bookService.removeBook(id);
	}
	
	

}
