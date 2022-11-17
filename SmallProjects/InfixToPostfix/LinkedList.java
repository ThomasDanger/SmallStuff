package com.mycompany.main;

public class LinkedList{
    
    private Node head;
    
    public LinkList(){head = null;}
    public LinkList(Node h){head = h;}
    public Node GetHead(){return head;}
    public void setHead(Node h ){head = h;}
    
    public void push(Node newHead)
    {
        newHead.setNext(head);
        head = newHead;
    }
    
    public Node pop()
    {
        Node temp = head;
        head = head.getNext();
        return temp;
    }
    /*public Node Peek()
    {
        return head;
    }*/
}
