package com.example.Book.controller.concretes;
import com.example.Book.business.abstracts.BookService;
import com.example.Book.controller.abstracts.BookController;
import com.example.Book.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class MysqlBookRepository implements BookController {

    @Autowired
    private BookService bookService;

    @Override
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/title")
    @Override
    public Book getBookByTitle(String title) {
        Optional<Book> book = bookService.getBookByTitle(title);
        return book.orElse(null);
    }

    @Override
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @Override
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book) {
        return bookService.updateBook(id,book);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
