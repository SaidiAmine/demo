package home.formation.demo.repertoires;

import home.formation.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRep extends CrudRepository<Book, Long> {
}
