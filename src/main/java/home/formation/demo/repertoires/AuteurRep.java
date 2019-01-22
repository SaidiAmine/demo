package home.formation.demo.repertoires;

import home.formation.demo.models.Auteur;
import org.springframework.data.repository.CrudRepository;

public interface AuteurRep extends CrudRepository<Auteur, Long> {
}
