package com.example.web.hobbyservice.respository;

import org.springframework.data.repository.CrudRepository;
import com.example.web.hobbyservice.table.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}