package home.formation.demo.repertoires;

import home.formation.demo.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRep extends CrudRepository<Publisher, Long> {
}
