package com.mycompany.main;

public class Node<G extends Comparable> implements Comparable<Node<G>>{
    private G data;
    private Node<G> next;
    
    public Node(){
        data = null;
        next = null;
    }
    
    public Node(G data_){
        data = data_;
        next = null;
    }
    
    public void setData(G data_){
        data = data_;
    }
    public void setNext(Node<G> next_){
        next = next_;
    }
    public G getData(){
        return data;
    }
    public Node<G> getNext(){
        return next;
    }
    
    @Override
    public int compareTo(Node<G> n){
        return data.compareTo(n.data);
    }
}
