public class DLL {
    Node head, tail;

    static class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtLast(int data) {
        Node arr = new Node(data);
        if (head == null) {
            head = arr;
            tail = arr;
        } else {
            tail.next = arr;
            arr.prev = tail;
            tail = arr;
        }
    }

    public void insertAtBegin(int data){
        Node arr = new Node(data);
        if (head == null) {
            head = arr;
            tail = arr;
        } else {
            head.prev = arr;
            arr.next = head;
            head = arr;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtLast(1);
        dll.insertAtBegin(4);

        // Print the elements of the DLL
        Node current = dll.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}

