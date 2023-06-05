public class Card {

    public String suit;
    public int value;
    public String name;
    public boolean isdealt;

    public Card(int pName, int pSuit){
        if (pSuit == 0) {
            suit = "Diamonds";
        }
        if(pSuit == 1){
            suit = "Spades";
        }
        if(pSuit == 2){
            suit = "clubs";
        }
        if(pSuit == 3){
            suit ="hearts";
        }
        if(pName == 0){
            name = "Ace";
        }
        if(pName == 1){
            name = "two";
        }
        if(pName == 2){
            name = "three";
        }
        if(pName == 3){
            name = "four";
        }
        if(pName == 4){
            name = "five";
        }
        if(pName == 5){
            name = "six";
        }
        if(pName == 6){
            name = "seven";
        }
        if(pName == 7){
            name = "eight";
        }
        if(pName == 8){
            name = "nine";
        }
        if(pName == 9){
            name = "ten";
        }
        if(pName == 10){
            name = "jack";
        }
        if(pName == 11){
            name = "queen";
        }
        if(pName == 12){
            name = "king";
        }
        //System.out.println("You made the " + name + " of " + suit);
    }
    public void printcard(){
        System.out.println("This is the " + name + " of " + suit);
    }
}
