package org.myGroup.Project12_SimpleSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController{

//	ArrayList<Book> myBook = new ArrayList<Book>();
//	@GetMapping("/books_2")
//	public ArrayList<Book> getAllBooks(){
//		myBook.add(new Book(1, "Java","Mr. King"));
//		myBook.add(new Book(2, "Python","Miss Queen"));
//		return myBook;
//	}
	
	@GetMapping("books")
	public List<Book> getAllBook(){
		return Arrays.asList(new Book(1, "Java Principle 2.0", "Jems Gosling"));
	}	
}