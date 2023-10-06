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
        Node place = root;
        Node parent = root;
        Node child = root;
        for (int j = 0; j <= i; j++) {
            place = place.getChild();
        }
        if (place.getChild() != null && place.getParent() != null) {

        }
        return
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

    }
}
