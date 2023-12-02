public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // method to remove nodes
    public void remove() {
        if (head == null || head == tail) {
            return;
        }
        Node<T> node = head;
        Node<T> prev = null;
        while (node != null && node.next != null) {
            while (node.next != null && node.next.data.compareTo(node.data) > 0) {
                if (node == head) {
                    head = node.next;
                    break;
                } else {
                    prev.next = node.next;
                    node = node.next;
                }
            }
            prev = node;
            node = node.next;
        }
    }

    // method to get middle node of linkedlist
    public T getMiddleNode() {
        if (head == null) {
            return null;
        }
        Node<T> fast = head;
        Node<T> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    // method to add node
    public void add(T data) {
        Node<T> node = new Node<>(data);
        // if list is empty
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    // method to print the linkedlist
    @Override
    public String toString() {
        String listdata = "";
        Node<T> node = head;
        while (node != null) {
            if (node.next == null) {
                listdata += node.data;
            } else {
                listdata += node.data + " -> ";
            }
            node = node.next;
        }
        return listdata;
    }
}
