/*
CZ
10/11/23
HK
 */

public class ArrayList<T> {

    private int index;
    private Node root;

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
        return true;
    }

    public void add(int i, T data) {
        if (i < 0 || i > size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> newNode = new Node<>(data);

        if (i == 0) {
            newNode.setChild(root);
            if (root != null) {
                root.setParent(newNode);
            }
            root = newNode;
        } else {
            Node<T> current = root;
            int currentIndex = 0;

            while (current != null && currentIndex < i - 1) {
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
            }
        }
    }

    public T remove(int i) {

        if (i < 0 || i >= size()) {
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
        int count = 0;
        Node<T> place = root;
        while (place != null) {
            count++;
            place = place.getChild();
        }
        return count;
    }

    public String toString() {
        StringBuilder list = new StringBuilder();
        Node<T> place = root;
        list.append("(");
        while (place != null) {
            list.append(place);
            place = place.getChild();
            if (place != null) {
                list.append(", ");
            }
        }
        list.append(")");
        return list.toString();
    }
}
