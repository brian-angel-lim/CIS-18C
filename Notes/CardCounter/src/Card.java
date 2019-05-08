public class Card {
    private String rank;
    private String suit;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    //gives a nicer representation on output
    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

//    @Override
//    public int compareTo(Object o) {
//
//    }
}
