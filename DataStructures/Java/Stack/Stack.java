public class Stack<G> {
    private Node<G> top;
    
    public Stack(){
        top = null;
    }
    
    public Stack(Node<G> top_){
        top = top_;
    }
    
    public G peek(){
        return top.getData();
    }
    
    public void push(G data){
        Node<G> node = new Node(data);
        if(top!=null)
            node.setNext(top);
        top = node;
    }
    
    public G pop(){
        Node<G> temp = top;
        if(top!=null)
            top = top.getNext();
        return temp.getData();
    }
    
    public int size(){
        Node<G> cur = top;
        int i = 0;
        while(cur!=null){
            cur=cur.getNext();
            i++;
        }
        return i;
    }
}
