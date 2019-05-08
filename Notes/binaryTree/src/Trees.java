public class Trees {

    public static void main(String[] args) {
        Tree<String> myTree = new Tree();
        myTree.add("Hello");
        myTree.add("There");
        myTree.add("We");
        myTree.add("At");
        myTree.add("Last");
        myTree.add("General");
        myTree.add("Kenobi");
        myTree.printInOrder(myTree.root);

    }
}
