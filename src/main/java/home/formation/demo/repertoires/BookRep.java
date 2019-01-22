package home.formation.demo.repertoires;

import org.springframework.data.repository.CrudRepository;

public interface BookRep extends CrudRepository<Book, Long> {
}
