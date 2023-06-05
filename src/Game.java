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
                //deck[count].printcard();
                count++;
            }
        }
        shuffle();
    }
    public void shuffle(){
        Card[] shuffledeck = new Card[52];
        for(int f=0; f< shuffledeck.length; f++){
            int randomcard = (int)(Math.random()*52);
            Card shufflecard = deck[randomcard];

            while (deck[randomcard].isdealt == true){
                randomcard = (int)(Math.random()*52);
                shufflecard = deck[randomcard];
            }
            deck[randomcard].isdealt = true;
            shufflecard.printcard();
            shuffledeck[f] = shufflecard;
        }
        deck = shuffledeck;
    }
}