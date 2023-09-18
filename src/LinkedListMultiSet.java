public class LinkedListMultiSet implements Multiset {
    private Node front;
    int size;

    public LinkedListMultiSet() {
        front = null;
        size = 0;
    }

    public boolean add(long item) {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        size += 1;
        return true;
    }

    public void remove(long item) {

    }
}
