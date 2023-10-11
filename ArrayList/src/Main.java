/*
CZ
10/11/23
HK
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("math");
        arrayList.add("science");
        arrayList.add(1, "language");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.set(0,"5");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));



    }
}