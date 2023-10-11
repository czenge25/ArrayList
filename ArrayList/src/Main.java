/*
CZ
10/11/23
HK
 */

public class Main {
    public static void main(String[] args) {

        // Create an instance of the custom ArrayList class with String elements
        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements of school subjects to the ArrayList
        arrayList.add("math"); // Adding "math" to the end of the list
        arrayList.add("science"); // Adding "science" to the end of the list
        arrayList.add(1, "language"); // Adding "language" at index 1 in the list

        // Print the ArrayList and its size
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        // Remove an element from the ArrayList and check size after
        arrayList.remove(2); // Removing the element at index 2
        System.out.println(arrayList.size());

        // Print the updated ArrayList
        System.out.println(arrayList);

        // Set an element at a specific index in the ArrayList
        arrayList.set(0, "5"); // Setting the element at index 0 to "5"
        System.out.println(arrayList);

        // Get and print an element from the ArrayList
        System.out.println(arrayList.get(1)); // Get the element at index 1 and print it
    }
}
