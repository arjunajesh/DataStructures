public class WeightedQuickUnion {
    int[] parent;
    int[] size;
    public WeightedQuickUnion(int n){
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            size[i] = 1;
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

        if(size[rootP] <= size[rootQ]){
            parent[rootQ] = rootP;
            size[rootP]+=size[rootQ];
        }
        else{
            parent[rootP] = rootQ;
            size[rootQ]+= size[rootP];
        }
    }
}
