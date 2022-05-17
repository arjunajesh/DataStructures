public class QuickUnion {
    int[] parent;
    public QuickUnion(int n){
        parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    public int find(int n){
        while(n!=parent[n]){
            n = parent[n];
        }
        return n;
    }
    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        parent[rootQ] = rootP;
    }
}
