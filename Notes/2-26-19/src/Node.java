//making a linked list
//linked list are good when you have information in **very** separate places (example: everytime you click on a link and go to a page, ur using a linked list
public class Node {
    Integer data = null;
    Node next = null; //Can make a data type of itself because every object is a reference object (pointer). In c++ this would be declared like: Node* next
    Node prev = null;

    public Node(Integer data) {
        this.data = data;
    }

    public Node retrieve(Integer index) {
        if (index != 0) {
            return this.next.retrieve(--index);
        }
        else {
            return this;
        }
    }
    //adding a note to a linked list
    //basically, find the tail of the linked list and add to it. Find the node that is the tail and once it is found, node is added.
    public void add(Node nodeToAdd) {
        if (this.next == null) {
            this.next = nodeToAdd;
        } else {
            this.next.add(nodeToAdd); //Kinda recursive, calls itself on a different object all together as opposed to itself. Each node has its own next and its own
            //data
        }
    }

    //Remove a node from the end
    public void remove()  {
        if (this.next == null) {
            //I'm a single-node linked list
            //KILL ME...
            System.out.println("Nope, cant do");
        }

        //this.next.next - method chaining
        if (this.next.next == null){
            //we know we're the tail
            //cut it off

            //We're not actually deleting it, we're just saying the node is empty. Since Java makes everything a reference object, this is okay and wont cause
            //memory leaks
            this.next = null;
        } else {
            //Next one is not the tail... don't care
            this.next.remove();
        }
    }


    //edge case: What if there is no next?
    //Solution: just tell them there is none
    public Node search(Integer intToFind) {
        if (this.data == intToFind) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.search(intToFind);
        }
    }
}
