public class Card {

    public String suit;
    public int value;
    public String name;
    public boolean isdealt;

    public Card(int pSuit, int pName){
        if (pSuit == 0) {
            suit = "Diamonds";
        }
        if(pSuit ==1){
            suit = "Spades";
        }
        if(pSuit == 2){
            suit = "clubs";
        }
        if(pSuit == 3){
            suit ="hearts";
        }

    }
}
