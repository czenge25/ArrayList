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

    }
}