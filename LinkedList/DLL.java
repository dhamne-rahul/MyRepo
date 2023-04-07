package LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    DLL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this(val);
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertAtStart(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Print in Revrse order");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.print("END");
    }

    public void insertAtLast(int val) {
        Node node =new Node(val);
        Node temp=head;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
}
