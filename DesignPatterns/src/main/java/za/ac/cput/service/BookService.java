package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Book;
import za.ac.cput.repository.BookRepository;
import za.ac.cput.repository.IRepository;

@Service
public class BookService {
    private BookRepository repository;

    @Autowired
    public BookService( BookRepository repository ) {this.repository = repository;}
    public Book create(Book book){
        return repository.save(book);
    }
}
