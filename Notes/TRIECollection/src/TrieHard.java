import java.util.Scanner;

public class TrieHard {
    public static void main(String args[]){
        String twitter = "Twitch";
        String twitch = "Titter";
        String anotherWord = "Twist";
        String bWord = "Ball";
        TTrie trie = new TTrie();
        trie.add(twitter);
        trie.add(twitch);
        trie.add(anotherWord);
        trie.add(bWord);
        Scanner keyboard = new Scanner(System.in);

        //System.out.println(trie);
    }
}
