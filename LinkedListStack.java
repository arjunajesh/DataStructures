public class LinkedListStack {
    private Node first = new Node();
    private class Node{
        private String val;
        private Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void push(String item){
        Node old = first;
        first = new Node();
        first.val = item;
        first.next = old;
    }
    public String pop(){
        String s = first.val;
        first = first.next;
        return s;
    }
}
