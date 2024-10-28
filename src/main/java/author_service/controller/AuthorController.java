package author_service.controller;

import author_service.Dto.Book;
import author_service.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import author_service.service.AuthorService;

import java.util.List;

@RestController

@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;



    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author){

        return authorService.addAuthor(author);
    }

    @GetMapping("/author/{authurId}")
    public Author getAuthor(@PathVariable String authurId){
        return authorService.getAuthor(authurId);
    }

    @GetMapping("/all")
    public List<Author> getAllAuthor(){
        return authorService.getAllAuthor();
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/delete/{authurId}")
    public void deleteAuthor(@PathVariable String authurId){

        authorService.deleteAuthor(authurId);
    }

    @GetMapping("Books/{authurId}")
    public List<Book> getAllAuthorBooks(@PathVariable String authurId){
        return authorService.getAllAuthorBooks(authurId);
    }

}
