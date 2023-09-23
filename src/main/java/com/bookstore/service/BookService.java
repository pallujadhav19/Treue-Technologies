package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

@Service

public class BookService {
	@Autowired
	private BookRepository bookRepository; //creating obj of bookrepository
	
	public void save(Book b)//to save object into database
	{
		bookRepository.save(b);
	}
	
	public List<Book> getAllBook()
	{
		return bookRepository.findAll();
	}

	public Book getBookById(int id)
	{
		return bookRepository.findById(id).get();
	}
    
	public void deleteById(int id)
	{
		bookRepository.deleteById(id);
	}
}
