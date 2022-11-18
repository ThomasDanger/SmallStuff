package com.mycompany.main;

public class LinkedList<G extends Comparable> {
    private Node<G> head;
    
    public LinkedList(){
        head = null;
    }
    
    public void add(Node<G> n){
        if(head == null){
            head = n;
        }
        else{
            Node<G> cur = head;
            while(cur.getNext()!= null){
                cur=cur.getNext();
            }
            cur.setNext(n);
        }
    }
    
    public void add(G data){
        this.add(new Node(data));
    }
    
    public void insert(int index, Node<G> n){
        if(index == 0){
            n.setNext(head);
            head = n;
        }
        else{
            int i = 0;
            Node<G> cur = head;
            while(i<index-1 && cur!=null){
                cur=cur.getNext();
                i++;
            }
            if(cur!=null){
                n.setNext(cur.getNext());
                cur.setNext(n);
            }
        }
    }
    
    public void insert(int index, G data){
        this.insert(index, new Node(data));
    }
    
    public G get(int index){
        G returnVal;
        Node<G> cur = head;
        int i = 0;
        while(i < index && cur!=null){
            i++;
            cur=cur.getNext();
        }
        if(cur!=null)
            returnVal = cur.getData();
        else
            returnVal = null;
        
        return returnVal;
    }
    
    public Node<G> pop(){
        Node<G> temp = head;
        if(head != null){
            head = head.getNext();
        }
        return temp;
    }
    
    public Node<G> remove(int index){
        Node<G> returnVal;
        Node<G> cur = head;
        
        int i = 0;
        while(i < index-1 && cur.getNext()!= null){
            cur=cur.getNext();
            i++;
        }
        if(cur.getNext() == null){
            returnVal = null;
        }
        else{
            returnVal = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        return returnVal;
    }
    
    public void print(){
        this.print(head);
    }
    
    private void print(Node<G> n){
        if(n != null){
            System.out.print(n.getData());
            this.print(n.getNext());
        }
    }
    
    public void swap(int index1, int index2){
        G val1 = this.get(index1);
        G val2 = this.get(index2);
        
        if(val1 != null && val2!=null){
            this.remove(index2);
            this.insert(index2, val1);
            this.remove(index1);
            this.insert(index1, val2);
        }
    }
    
    public boolean contains(G target){
        Node<G> cur = head;
        boolean targetFound =false;
        while(cur != null){
            if(cur.getData().compareTo(target) == 0){
                targetFound = true;
                break;
            }
            cur = cur.getNext();
        }
        return targetFound;
    }
}
