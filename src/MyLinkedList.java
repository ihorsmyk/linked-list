
public class MyLinkedList<T> {
    private Node first;
    private int size;

    private class Node {
        T value;
        Node next;

        public Node(T value) {
            this.next = null;
            this.value = value;
        }
    }

    public MyLinkedList() {
        first = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        if (this.first == null) {
            this.first = newNode;
        } else {
            Node node = this.first;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        this.size++;
    }


    public T get(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }
        Node node = this.first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.size) {
            return false;
        }
        if (index == 0) {
            this.first = this.first.next;
        }
        Node node = this.first;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        this.size--;
        return true;
    }

    public boolean contains(T value) {
        Node node = this.first;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
