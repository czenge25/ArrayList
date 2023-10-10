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
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return true;
        }

        Node place = root;
        while (place.getChild() != null) {
            place = place.getChild();
        }
        place.setChild(n);
        length++;
        return true;
    }

    public void add(int i, T data) {
        Node<T> newNode = new Node<>(data);

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            newNode.setChild(root);
            if (root != null) {
                root.setParent(newNode);
            }
            root = newNode;
            return;
        }

        Node<T> current = root;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.getChild();
            currentIndex++;
        }

        if (current != null) {
            Node<T> next = current.getChild();
            current.setChild(newNode);
            newNode.setParent(current);
            newNode.setChild(next);
            if (next != null) {
                next.setParent(newNode);
            }
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
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
        Node place = root;
        for( int j =0; j<=i; j++) {
            place= place.getChild();
        }
        return (T) place.getData();

    }

    public T set(int i, T data) {
        Node place = root;
        for( int j =0; j<=i; j++) {
            place= place.getChild();
        }
        place.setData(data);
        return data;
    }


    public int size() {
        return length;
    }
}
