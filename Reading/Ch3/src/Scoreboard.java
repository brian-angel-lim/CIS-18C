public class Scoreboard {
    private int numEntries = 0; //number of actual entries
    private GameEntry[] board; //array of game entries (names & scores)

    //constructs an empty scoreboard with the given capacity for storing entries
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        //is the new entry e really a high score?
        //first expression checks if there is room to add a new score regardless of score value
        //second expression checks if value of the new score is higher than the score last in line
        //basically, this is the first logic gate. it checks if e qualifies as a new high score.
        if (numEntries < board.length || newScore > board[numEntries-1].getScore()){
            //if new high score is determined, there are two new tasks:
            //1. update number of entries (done by lines 22 & 23)
            //2. place new entry in the appropriate location (done by lines 32-37)
            //in this if statement - total number of entries can only be increased if the board is not yet full
            //When full, the addition of a new entry will be counteracted by the removal of the entry with the lowest score
            if (numEntries < board.length)              //checks if there is space on the board
            numEntries++;                               //if there is, overall number increases

            //shift any lower scores rightward to make room for the new entry
            /*cant I just write a for loop?*/
            /*for (int j = numEntries -1;j > 0 && board[j-1].getScore() < newScore;j--) {
                board[j] = board[j-1];
                board[j] = e; //HMMMMM kinda sus
            }*/
            /*Oh wait, int j is contained only in the for loop...*/
            int j = numEntries - 1;
            while (j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];                  //shift entry from j-1 to j
                j--;                                    //and decrement j
            }
            board[j] = e;                               //when shifting for lower entries is done, the new highscore is added
            //anatomy of while loop:
            /*
           >numEntries - 1 = index at which the last GameEntry will reside after completing the operation
           >index j is initially set to numEntries - 1
           >either j is the correct index for the newest entry, or one or more immediately before it will have lesser scores
           >the loop shifts entries rightward, decrementing j, as long as there is another entry at index j - 1 with a score less than the new score
             */
        }
    }

    
}
