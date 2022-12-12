//Breadth-First Print for Binary Tree class

//Probably not finished. I wrote this in 5 mins for a final exam review.

//Also, I wanted to test that I could implement breadth-first traversals on a binary tree because it seems to be common on technical interviews.
//This was incredibly easy.

public void printBF(){
    Queue<Node<G>> q = new LinkedList();
    q.add(root);
    while(!q.isEmpty()){
        Node<G> cur= q.remove();
        if(cur!=null)
            System.out.println(cur);
        if(cur!=null&&cur.getLeft()!=null)
            q.add(cur.getLeft());
        if(cur!=null&&cur.getRight()!=null)
            q.add(cur.getRight());
    }
}
