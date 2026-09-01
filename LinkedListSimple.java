class LinkedListSimple {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Insert 50
        head.next.next.next.next = new Node(50);

        System.out.println("After inserting 50:");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Delete 50
        head.next.next.next.next = null;

        System.out.println("\nAfter deleting 50:");

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}