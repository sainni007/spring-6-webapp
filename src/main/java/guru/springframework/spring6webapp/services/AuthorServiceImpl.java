package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepo;

    public AuthorServiceImpl(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepo.findAll();
    }
}
