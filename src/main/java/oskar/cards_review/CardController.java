package oskar.cards_review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
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

    @PutMapping("/cards/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Card updatedCard){
        Card card = cardRepository.getById(id);

        if (card != null){
            card.setName(updatedCard.getName());
            card.setOverall(updatedCard.getOverall());
            card.setPosition(updatedCard.getPosition());
            card.setReview(updatedCard.getReview());

            cardRepository.update(card);

            return 1;
        } else
            return -1;
    }

    @PatchMapping("/cards/{id}")
    public int partUpdate(@PathVariable("id") int id, @RequestBody Card updateCard){
        Card card = cardRepository.getById(id);

        if (card != null){
            if (updateCard.getName() != null) card.setName(updateCard.getName());
            if (updateCard.getOverall() > 0) card.setOverall(updateCard.getOverall());
            if (updateCard.getPosition() != null) card.setPosition(updateCard.getPosition());
            if (updateCard.getReview() != null) card.setReview(updateCard.getReview());

            cardRepository.update(card);

            return 1;
        } else
            return -1;

    }


}
