package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Library;
import com.library.service.LibraryService;


@RestController
@RequestMapping
public class LibraryController {
	
	@Autowired
	private LibraryService booksService;
	
//   @PostMapping("/books")
//   public int save(@RequestBody Library books) {
// 	  booksService.save(books);
// 	  return books.getId();
//   }

  @GetMapping("/books/{bookid}")
   public Library getBooksById(@PathVariable("bookid") int booksid) {
	   return booksService.getBookById(booksid);
   }
  
  @GetMapping("/allBooks")
  public java.util.List<Library> getAllBooks(){
	  return booksService.getAllBooks();
  }
  
  @DeleteMapping("/book/{bookid}")
  public void deleteById(@PathVariable("bookid") int bookid) {
	  booksService.deleteById(bookid);
  }
  
  //likhil
  
//  @PutMapping("/books")
//  public Library Update(@RequestBody Library books, int id) {
//	  booksService.saveOrUpdate(books, id);
//	return books;
//  }
}
merge testing hi
