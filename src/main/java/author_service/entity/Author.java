package author_service.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    String authurId;
    String name;
    String email;
    int age;
    String contact;

}
