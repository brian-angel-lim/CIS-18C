public class Scoreboard {
    private int numEntries = 0; //number of actual entries
    private GameEntry[] board; //array of game entries (names & scores)

    //constructs an empty scoreboard with the given capacity for storing entries
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    //use case - new highscore is achieved, needs to be added to Scoreboard
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

    //use case - dirty cheater needs to get score removed
    //Remove and return the high score at index i
    //Should this be in GameEntry or Scoreboard??
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        //if i is less than 0 or greater/equal to the number of entries on the board
        if(i < 0||i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];                      //save the object to be removed
        for (int j=i; j<numEntries -1;j++)              //count up from i(not down)
            board[j] = board[j+1];                      //move one cell to the left (so shifts it left?)
        board[numEntries - 1] = null;                   //null out the old last score
        numEntries--;
        return temp;                                    //return the removed object
    }

    /*
    >Because we're moving references higher than i one cell to the left, we don't go all the way to the end of the array
    >First, we base our loop on the number of current entries, not the capacity of the array.
    >This is because there is no reason for shifting a series of null references that may be at the end of the array
    >We define the loop condition, j < numEntries - 1, so that the last iteration of the loop assigns board[numEntries-1] = board[numEntries-1]
    >There is no entry to shift into cell board[numEntries-1], so we return that cell to null just after the loop
    >The object of the removed entry no longer has any reference pointing to it within the board array
     */

}
