package home.formation.demo.controllers;

import home.formation.demo.repertoires.BookRep;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRep bookRep;

    public BookController(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    //Test
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("model",bookRep.findAll());
        return "books";
    }
}
