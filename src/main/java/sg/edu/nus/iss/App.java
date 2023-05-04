package sg.edu.nus.iss;


public class App 
{
    public static void main( String[] args )
    {
        CardsDeck cardDeck = new CardsDeck();

        System.out.println(cardDeck);

        cardDeck.shuffleDeck();
        System.out.println(cardDeck);
    }
}
