ArrayList Class

The ArrayList class is a custom implementation of the ArrayList data structure in Java. It is designed to store and manipulate a list of elements stored in Nodes of any generic data type (T). This class provides methods for adding, removing, accessing, and modifying elements within the list.

Class Members
private Node root: This member represents the root node of the linked list used to implement the dynamic array.

Constructors
public ArrayList(): This is the default constructor for the ArrayList class. It initializes an empty ArrayList.

Methods
public boolean add(T data): Adds a new element with the specified data to the end of the list. It returns true if the operation is successful.

public void add(int i, T data): Adds a new element with the specified data at the specified index i in the list. If i is out of bounds, it throws an IndexOutOfBoundsException.

public T remove(int i): Removes the element at the specified index i from the list and returns the removed element. If i is out of bounds, it throws an IndexOutOfBoundsException.

public T get(int i): Retrieves and returns the data from the element at the specified index i.

public T set(int i, T data): Sets the data of the element at the specified index with the new data and returns the previous data.

public int size(): Returns the number of elements in the list.

public String toString(): Returns a string representation of the list.

Main Class
The Main class contains the main method, serving as the entry point for running and testing the ArrayList class. In this class, an instance of the ArrayList class is created with String elements, and various operations on the list are performed, including adding, removing, setting, and accessing elements.

Usage
To use the Main class, you can follow the example provided in the main method. Simply run the Main class, and it will demonstrate how to work with the custom ArrayList class, showcasing its functionality.
