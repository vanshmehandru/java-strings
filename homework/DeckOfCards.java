package homework;
import java.util.Scanner;

public class DeckOfCards {

   static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
   static String[] ranks = {
           "2", "3", "4", "5", "6", "7", "8", "9", "10",
           "Jack", "Queen", "King", "Ace"
   };

   // a. Initialize the deck
   static String[] initializeDeck() {
       int numOfCards = suits.length * ranks.length;
       String[] deck = new String[numOfCards];
       int index = 0;
       for (String suit : suits) {
           for (String rank : ranks) {
               deck[index++] = rank + " of " + suit;
           }
       }
       return deck;
   }

   // b. Shuffle the deck
   static void shuffleDeck(String[] deck) {
       for (int i = 0; i < deck.length; i++) {
           int randomCardNumber = i + (int)(Math.random() * (deck.length - i));
           String temp = deck[i];
           deck[i] = deck[randomCardNumber];
           deck[randomCardNumber] = temp;
       }
   }

   // c. Distribute cards
   static String[][] distributeCards(String[] deck, int n, int x) {
       if (n % x != 0) {
           System.out.println("Cards cannot be evenly distributed!");
           return null;
       }

       int cardsPerPlayer = n / x;
       String[][] players = new String[x][cardsPerPlayer];

       int index = 0;
       for (int i = 0; i < x; i++) {
           for (int j = 0; j < cardsPerPlayer; j++) {
               players[i][j] = deck[index++];
           }
       }
       return players;
   }

   // d. Print players and their cards
   static void printPlayers(String[][] players) {
       if (players == null) return;
       for (int i = 0; i < players.length; i++) {
           System.out.println("Player " + (i + 1) + ": ");
           for (String card : players[i]) {
               System.out.println("  " + card);
           }
           System.out.println();
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String[] deck = initializeDeck();
       shuffleDeck(deck);

       System.out.print("Enter number of cards to distribute: ");
       int n = sc.nextInt();

       System.out.print("Enter number of players: ");
       int x = sc.nextInt();

       String[][] players = distributeCards(deck, n, x);
       printPlayers(players);
   }
}
