import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();

        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();

        System.out.println("remove element at index 5: " + list.remove(5));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();

        System.out.println("does the list contain the number 0: " + list.contains(0));
        System.out.println("does the list contain the number 1: " + list.contains(1));
        System.out.println("does the list contain the number 20: " + list.contains(20));
    }
}
