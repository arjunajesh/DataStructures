public class Queue {
    Node first = new Node();
    Node last = new Node();
    public class Node{
        String item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void enqueue(String s){
        Node old = last;
        last = new Node();
        last.item = s;
        if(isEmpty()){
            first = last;
        }
        else{
            old.next = last;
        }
    }
    public String dequeue(){
        String item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        else{
            return item;
        }
        return null;
    }
}
