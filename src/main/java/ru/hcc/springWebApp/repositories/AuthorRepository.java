package ru.hcc.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.springWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
