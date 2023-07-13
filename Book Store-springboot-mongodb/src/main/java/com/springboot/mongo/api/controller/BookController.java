package com.springboot.mongo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.api.model.Book;
import com.springboot.mongo.api.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookrepository;
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		bookrepository.save(book);
		return "Added Book withId: "+book.getId();
	}
	
	@GetMapping("/getallBooks")
	public List<Book> getBooks(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/getallBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return bookrepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookrepository.deleteById(id);
		return "Book Deleted with Id: "+id;		
	}
}
