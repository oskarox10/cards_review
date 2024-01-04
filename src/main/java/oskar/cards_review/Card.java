package oskar.cards_review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Card {

    private int id;
    private String name;
    private int overall;
    private String position;
    private String review;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public Card(int id, String name, int overall, String position, String review) {
        this.id = id;
        this.name = name;
        this.overall = overall;
        this.position = position;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", overall=" + overall +
                ", position='" + position + '\'' +
                ", review='" + review + '\'' +
                '}';
    }


    public Card() {

    }

}
