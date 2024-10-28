package author_service.fegin;


import author_service.Dto.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(name="book-service",url="http://author-service:5959/api")
public interface BookInterface {
    @GetMapping("authorbooks/{bookAuthurId}")
    public List<Book> getAuthorBooks(@PathVariable String bookAuthurId);
}
