//<T> makes it a generic object
public class Tree<T extends Comparable>{
    TreeNode<T> root;
    public void add(T data) {
        if (root == null) {
            root = new TreeNode();
            root.data = data;
        } else {
            root.add(data);
        }
    }

    public TreeNode search(TreeNode n, T termTosearch) {
        // if node is null, return null
        // if term to search is in n, return n
        // if termToSearch is less than value at n, search left
        // if termToSearch is greater than value at n, search right
    }
    //prints all of the nodes of the tree using in-order traversal
    public void printInOrder(TreeNode n){
        if (n == null) {
            return;
        }

        //Go down to the left until you get ot the end and print
        printInOrder(n.left);
        //output yourself
        System.out.println(n);
        //go down the right until you get ot the end and print
        printInOrder(n.right);
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean end = false;
        while (!end) {

        }
    }*/
}
