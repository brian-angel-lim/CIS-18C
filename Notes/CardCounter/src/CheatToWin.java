import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CheatToWin {

    public static void main(String[] args) {
        HashMap<String, Integer> cardCounts = new HashMap();
        HashMap<String, Double> cardProbabilities = new HashMap();
        String[] suits = { "h", "d", "c", "s" };
        String[] ranks = { "a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};

        ArrayList<Card> deck = new ArrayList();
        Collections.shuffle(deck); //library function from Collections that shuffles...

        // Generate the 52 cards in the deck
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                //.puts(0,0) is how we add to maps; initializes the card counts
                cardCounts.put(ranks[j], 0);
//                cardProbabilities.put(ranks[j], (4.0 / 52.0)); - wrong method
                // Create the card
                Card c = new Card();
                c.setRank(ranks[j]);
                c.setSuit(suits[i]);
                // Add the card to the deck
                deck.add(c);
            }
        }

        //Shuffle the deck using knuth-fisher-yates shuffle
        Collections.shuffle(deck);

        final int CARDS_TO_GET = 20; // Snag X number of cards from the deck
        //i = the number of cards that we're gonna grab in this run
        for (int i = 0; i < CARDS_TO_GET; i++) {
            Integer currentCount = cardCounts.get(deck.get(i).getRank());
            cardCounts.put(deck.get(i).getRank(), currentCount + 1);
        }

        //Now, try to calculate the probability of the next card


        //the output will display an unordered output that doesn't match how it should be
//        System.out.println(cardCounts);
//        System.out.println(deck);
        System.out.println("Cards shuffled. Which rank came up next?");
        Scanner input = new Scanner(System.in);
        String nextRank = input.nextLine();
        Integer rankCount = cardCounts.get(nextRank);
        Double probability = computeProbability(rankCount, deck.size() - CARDS_TO_GET);
        System.out.println("The probability of getting " + nextRank + " is " + probability);
        System.out.println("counted " + rankCount + " of " + nextRank);
    }


    //computes the probability rather than hardcoding it in the map, replaced the previous statement
    public static Double computeProbability(Integer rankCount, Integer totalCardsLeft) {
        int rankCardsLeft = 4- rankCount;
        System.out.println(rankCount + " " + totalCardsLeft);
        Double returnValue = new Double(rankCount / new Double(totalCardsLeft));
        System.out.println(returnValue);
        return returnValue;
    }

}
