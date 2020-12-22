package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Books;
import com.springboot.service.BooksService;

@RestController
public class BooksController {
	@Autowired
	BooksService bookservice;
	@GetMapping("/getall")
	private void getallbooks(@RequestBody Books books)
	{
		bookservice.getAllBooks();
	}
	@PostMapping("/books")
	private void saveBook(@RequestBody Books books)
	{
	bookservice.saveorupdate(books);
	}
	@GetMapping("/books/{bookid}")
	private void getallbooks(@PathVariable("bookid")int bookid)
	{
	bookservice.getBooksByID(bookid);
	}
	@DeleteMapping("/books/{bookid}")
	private void deleteBookByid(@PathVariable("bookid")int pookid)
	{
		bookservice.deleteById(pookid);
	}
	@PutMapping("books/{bookid}")
	private void updateById(@PathVariable("bookid")int bookid,Books books)
	{
		bookservice.update(bookid, books);
	}
	@PostMapping
	private void updateBookByid(@PathVariable("bookid")int bookid,Books books)
	{
		bookservice.update(bookid, books);
	}
}