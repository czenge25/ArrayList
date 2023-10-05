/*
CZ
10/11/23
HK
 */
public class Node<T> {

    private T data; //Data stored in the node
    private Node parent; //Reference to the parent node
    private Node child; //Reference to the child node

    //Default constructor
    public Node() {

    }

    //Constructor that sets data of the node
    public Node(T data) {
        this.data = data;
    }

    //Constructor that sets data, parent, and child
    public Node(T data, Node parent, Node child) {
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    //Returns the data stored in the node
    public T getData() {
        return data;
    }

    //Sets the data for this node
    public void setData(T data) {
        this.data = data;
    }

    //Provides a string representation of the node by converting its data to a string
    public String toString() {
        return "Node: " + this.data.toString();
    }

    //Compares the data of the node with the data of another node 'n'
    public boolean equals(Node n) {
        return this.data.equals(n.getData());
    }
}