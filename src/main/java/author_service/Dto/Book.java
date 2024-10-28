package author_service.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Book {

    private int bookId;
    private String bookTitle;
    private String bookPrice;
    private LocalDate bookPublished;
    private String bookImageUrl;
    private String bookAuthurId;
}