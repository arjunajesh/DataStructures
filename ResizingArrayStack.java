public class ResizingArrayStack {
    String[] stack = new String[1];
    int n = 0;
    public boolean isEmpty(){
        return n==0;
    }
    public void push(String s){
        stack[n++] = s;
        if(n==stack.length) resize(2*stack.length);
    }
    public String pop(){
        String s = stack[--n];
        stack[n] = null;
        if (n>0 && n==stack.length/4) resize(stack.length/2);
        return s;
    }
    public void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i < stack.length; i++) {
            copy[i] = stack[i];
        }
        stack = copy;
    }
}
