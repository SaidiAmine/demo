package home.formation.demo.bootstrap;

import home.formation.demo.models.Auteur;
import home.formation.demo.models.Book;
import home.formation.demo.models.Publisher;
import home.formation.demo.repertoires.AuteurRep;
import home.formation.demo.repertoires.BookRep;
import home.formation.demo.repertoires.PublisherRep;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuteurRep auteurRep;
    private BookRep bookRep;
    private PublisherRep publisherRep;

    public DevBootstrap(AuteurRep auteurRep, BookRep bookRep, PublisherRep publisherRep) {
        this.auteurRep = auteurRep;
        this.bookRep = bookRep;
        this.publisherRep = publisherRep;
    }

    private void initData(){
        Publisher p1 = new Publisher("Dar Ennachr", "16 Rue Paris, Tunis");
        publisherRep.save(p1);

        Auteur a1 = new Auteur("Gilbert", "Naccache");
        Book b1 = new Book("Le Cristal", "RF1579", p1);
        a1.getBooks().add(b1);
        b1.getAuteurs().add(a1);

        auteurRep.save(a1);
        bookRep.save(b1);

        Auteur a2 = new Auteur("James", "Hilton");
        Book b2 = new Book("Lost Horizon", "RF12566", p1);
        a2.getBooks().add(b2);
        b2.getAuteurs().add(a2);

        auteurRep.save(a2);
        bookRep.save(b2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
