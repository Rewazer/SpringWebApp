package ru.hcc.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.springWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
