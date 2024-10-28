package author_service.service;

import author_service.Dto.Book;
import author_service.entity.Author;
import author_service.fegin.BookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import author_service.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
@Autowired
    AuthorRepository authorRepository;

@Autowired
BookInterface bookInterface;

    public  List<Book> getAllAuthorBooks(String authurId) {

        List<Book> l=bookInterface.getAuthorBooks(authurId);
            return l;
    }

    public Author addAuthor(Author author) {
       return authorRepository.save(author);
    }

    public Author getAuthor(String authurId) {
        return authorRepository.findById(authurId).get();
    }

    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(String authurId) {
         authorRepository.deleteById(authurId);
    }
}
