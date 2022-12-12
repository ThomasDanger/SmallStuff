//Breadth-First Print for Binary Tree class

//Probably not finished. I wrote this in 5 mins for a final exam review.

//Also, I wanted to test that I could implement breadth-first traversals on a binary tree because it seems to be common on technical interviews.
//This was incredibly easy.

public void printBF(){
  Queue<Node<G>> q = new LinkedList();
  q.add(root);
  while(!q.isEmpty()){
    Node<G> cur= q.remove();
    System.out.println(cur);
    if(cur.getLeft()!=null)
      q.add(cur.getLeft());
    if(cur.getRight()!=null)
      q.add(cur.getRight());
  }
}
