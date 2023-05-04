package sg.edu.nus.iss;

public class Card {
    private Suit suits;
    private Rank ranks;


    public Card(Suit suits, Rank ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }

    public enum Suit{
        SPADES,
        CLUBS,
        HEARTS,
        DIAMONDS;
    }

    public enum Rank{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
    }

    public static Suit getSuit(int i){
        return Suit.values()[i];
    }

    public static Rank getRank(int i){
        return Rank.values()[i];
    }

    @Override
    public String toString() {
        return "Card [suits=" + suits + ", ranks=" + ranks + "]";
    }

}
