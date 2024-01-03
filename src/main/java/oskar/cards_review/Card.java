package oskar.cards_review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private int id;
    private String name;
    private int overall;
    private String position;
    private String review;


}
