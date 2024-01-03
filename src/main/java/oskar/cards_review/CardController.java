package oskar.cards_review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("cards")
    public int add(@RequestBody List<Card> cards){
        return cardRepository.save(cards);
    }
}
