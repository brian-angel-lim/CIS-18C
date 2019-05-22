public class TTrie {
    public TrieNode head;

    public TTrie() {
        head = new TrieNode();
    }

    public void add(String s) {
        // Grab first character of string s
        // find the child with that character data
        // set character data of TrieNode to first character of string
        // pass the rest of the word to TrieNode.add() method
        head.add(s);
    }

    @Override
    public String toString(){
        return head.toString();
    }


}
