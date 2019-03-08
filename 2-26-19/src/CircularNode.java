//making a circular linked list
//Circular linked list requires different adding and remove methods since we're changing the way the head and tail works
public class CircularNode {
    Integer data = null;
    CircularNode next = null; //Can make a data type of itself because every object is a reference object (pointer). In c++ this would be declared like: Node* next
    CircularNode prev = null;

    public CircularNode(Integer data) {
        this.data = data;
    }

    public CircularNode retrieve(Integer index, CircularNode head) {
        if (index != 0) {
            return this.next.retrieve(--index, head);
        }
        else {
            return this;
        }
    }
    //adding a node to a linked list
    //add is always adding to the end of the tail
    //now we're not worried about next being null because it's supposed to loop around
    public void add(CircularNode nodeToAdd, CircularNode head) {
        //if this.next == head, that means it's equal to the end
        if (this.next == head) {
            this.next = nodeToAdd;
            nodeToAdd.next = head;
        } else {
            this.next.add(nodeToAdd, head); //Kinda recursive, calls itself on a different object all together as opposed to itself. Each node has its own next and its own
            //data
        }
    }

    //Remove a node from the end
    public void remove(CircularNode head)  {
        /*
        //No longer needed since it loops itself
        if (this.next == null) {

            //I'm a single-node linked list
            //KILL ME...
            System.out.println("Nope, cant do");
        }*/

        //this.next.next - method chaining
        if (this.next.next == head){
            //we know we're the tail
            //cut it off

            //We're not actually deleting it, we're just saying the node is empty. Since Java makes everything a reference object, this is okay and wont cause
            //memory leaks
            this.next = head;
        } /*else {
            //Next one is not the tail... don't care
            this.next.remove(head);
        }*/
    }


    //edge case: What if there is no next?
    //Solution: just tell them there is none
    public CircularNode search(Integer intToFind, CircularNode head) {
        //.equals() is the proper way to compare two nodes
        if (this.data.equals(intToFind)) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.search(intToFind, head);
        }
    }
}
