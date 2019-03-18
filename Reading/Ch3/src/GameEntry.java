public class GameEntry {
    private String name;
    private int score;

    //Construct a game entry with given parameters
    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    //Returns the name field;
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "(" + name + ", " + score + ")";
    }


}
