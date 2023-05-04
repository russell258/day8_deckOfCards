package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class CardsDeck{
    private Card cards[];

    public CardsDeck() {
        this.cards = new Card[52];
        int counter =0;
        for (int s = 0; s < 4; s++) {
            for (int r = 0; r<13 ; r++){
                Card card = new Card(Card.getSuit(s), Card.getRank(r)); //Instantiate a Card
                this.cards[counter]=card; //Adding card to the Deck
                counter ++;
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(Arrays.asList(this.cards));
    }

    @Override
    public String toString() {
        return "CardsDeck [cards=" + Arrays.toString(cards) + "]";
    }

    
}
