package oskar.cards_review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Card> getAll() {
        return jdbcTemplate.query("SELECT id, name, overall, position, review FROM cards", BeanPropertyRowMapper.newInstance(Card.class));
    }

    public Card getById (int id) {
        return jdbcTemplate.queryForObject("SELECT id, name, overall, position, review FROM cards WHERE " + "id = ?", BeanPropertyRowMapper.newInstance(Card.class));
    }


    public int save(List<Card> cards) {
        cards.forEach(card -> jdbcTemplate.update("INSERT INTO cards(name, overall, position, review) VALUES (?,?)",
                card.getName(), card.getOverall(), card.getPosition(), card.getReview()));
        return 1;
    }
}
