package LinkedList;

import java.sql.Time;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    LL() {
        this.size=0;
    }

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertAtStart(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void insertAtTail(int val)
    {
        if(tail==null)
        {
            insertAtStart(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void insert(int val,int index)
    {
        if(index==1)
        {
            insertAtStart(val);
        }
        Node node=new Node(val);
        int count=1;
        Node temp=head;
        while(count<index-1)
        {
            temp=temp.next;
            count++;
        }
        node.next=temp.next;
        temp.next=node;
        size+=1;
    }
    public int size()
    {
        return this.size;
    }
    public int deleteFirst()
    {
        int val=head.val;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
        }
        int val=tail.val;
        Node secLast=get(size-2);
        tail=secLast;
        secLast.next=null;
        size--;
        return val;
    }
    private Node get(int n) {
        Node node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        int val=temp.next.val;
        temp.next=temp.next.next;
        size--;
        return val;
    }
    public boolean find(int target){
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==target)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void insertRec(int val,int index){
        head=solve(val,index,head);
    }
    public Node solve(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val, node.next);
            size++;
            return temp;
        }
        node.next=solve(val, index-1, node.next);
        return node;
    }
}
