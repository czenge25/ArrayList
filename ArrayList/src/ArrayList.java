/*
CZ
10/11/23
HK
 */

public class ArrayList<T> {

    private int index;
    private Node root;
    private int length;

    public ArrayList() {

    }

    public boolean add(T data) {
        Node place = root;
        Node n = new Node(data);
        while (place.getChild() != null) {
            place = place.getChild();
            length += 1;
        }
        place.setChild(n);
        return true;
    }

    public void add(int i, T data) {
        Node place = root;
        Node n = new Node(data);
        for (int j = 0; j <= i; j++) {
            place = place.getChild();
        }
        place.setChild(n);
    }

    public T remove(int i) {

        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> currentNode = root;

        for (int j = 0; j < i; j++) {
            currentNode = currentNode.getChild();
        }

        T removedData = currentNode.getData();
        Node<T> parentNode = currentNode.getParent();
        Node<T> childNode = currentNode.getChild();

        if (parentNode != null) {
            parentNode.setChild(childNode);
        } else {
            root = childNode;
        }

        if (childNode != null) {
            childNode.setParent(parentNode);
        }
        length--;

        return removedData;
    }

    public T get(int i) {

    }

    public T set(int i, T data) {

    }

    public int size() {

    }
}
