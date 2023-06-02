public class Game {
    public int a;
    public int b;
    public Card card1;
    public Card card2;
    public Card[] deck;
    public int count = 0;

    public static void main(String[] args) {
        Game blackjack = new Game();
    }

    public Game() {
        System.out.println("Game constructor");

        deck = new Card[52];
        for (int w = 0; w < 4; w++) {
            for (int x = 0; x < 13; x++) {
                deck[count] = new Card(x, w);
                count++;
            }
        }


//        card1 = new Card(1,1);
//        card1.print();
//        card2 = new Card(2,1);
//        card2.print();


    }
}