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
        Node current = front, previous = null;
        while (current != null) {
            if (current.item == item) {
                size -= 1;
                if (previous != null) previous.next = current.next;
                else front.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean contains(long item) {
        Node current = front;
        while (current != null) {
            if (current.item == item) return true;
            current = current.next;
        }
        return false;
    }
}
