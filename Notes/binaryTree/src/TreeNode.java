public class TreeNode<T extends Comparable> {
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode<T> parent;
    T data;

    public void add(T data) {
        if (data.compareTo(this.data) < 0) {
            // check the left side
            if(left == null) {
                // add a new tree node ot the left
                left = new TreeNode();
                // add the data to that new tree node
                left.data = data;
                // DADDY
                left.parent = this;
            } else {
                left.add(data);
            }
        } else {
            // check the right side
            if(right == null) {
                // add a new tree node ot the right
                right = new TreeNode();
                // add the data to that new tree node
                right.data = data;
                //daddy
                right.parent = this;
            } else {
                right.add(data);
            }
        }
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
