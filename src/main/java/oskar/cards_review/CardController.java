package oskar.cards_review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    CardRepository cardRepository;

    @GetMapping("/cards")
    public List<Card> getAll() {
        return cardRepository.getAll();
    }


    @GetMapping("/cards/{id}")
    public Card getById(@PathVariable int id){
        return cardRepository.getById(id);
    }
}
