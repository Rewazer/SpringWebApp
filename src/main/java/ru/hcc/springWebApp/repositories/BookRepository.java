package ru.hcc.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.springWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
