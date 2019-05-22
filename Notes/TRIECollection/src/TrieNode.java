import java.util.ArrayList;
import java.util.HashMap;

public class TrieNode {
    public Character data;
    HashMap<Character, TrieNode> children;
    TrieNode parent;

    //No-argument constructor that acts as the head trie node
    public TrieNode() {
        data = '\0';
        children = new HashMap();
        parent = null;
    }

    public TrieNode(Character newChar, TrieNode parent) {
        this.parent = parent;
        this.data = newChar;
        children = new HashMap();
    }

//    public ArrayList<String> collapse(ArrayList<String> memo) {
//        if (children.isEmpty()) {
//            ArrayList<String> newList = new ArrayList();
//            newList.add(this.data.toString());
//            return newList;
//        } else {
//
//        }
//    }

    public void add(String s) {
        if (s.length() == 0) {
            return;
        }

        if (children.containsKey(s.charAt(0))) {
            // Retrieve the TrieNode child
            TrieNode child = children.get(s.charAt(0));
            // Add the remaining string to that child TrieNode
            child.add(s.substring(1)); //reduced it by 1
        } else {
            // Create a new TrieNode child
            TrieNode child = new TrieNode(s.charAt(0), this);
            children.put(s.charAt(0), child);
            child.add(s.substring(1));
        }
    }

    @Override
    public String toString() {
        return "Char: " + this.data + " and children = " + this.children;
    }
}
