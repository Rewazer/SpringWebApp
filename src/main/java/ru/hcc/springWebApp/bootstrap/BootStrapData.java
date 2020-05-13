package ru.hcc.springWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.hcc.springWebApp.domain.Author;
import ru.hcc.springWebApp.domain.Book;
import ru.hcc.springWebApp.domain.Publisher;
import ru.hcc.springWebApp.repositories.AuthorRepository;
import ru.hcc.springWebApp.repositories.BookRepository;
import ru.hcc.springWebApp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJBS = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJBS);
        noEJBS.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJBS);

        Publisher piter = new Publisher();
        piter.setName("Piter");
        piter.setAddressLine1("Piter");
        piter.setCity("Piter");
        piter.setState("Piter");
        piter.setZip("454100");

        publisherRepository.save(piter);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Publishers: "+ publisherRepository.count());
        System.out.println("Number of Books: "+ bookRepository.count());
    }
}
