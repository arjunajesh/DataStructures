public class quickfind {
    public int[] id;
    public quickfind(int n){
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }
    public int find(int n){
        return id[n];
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i]==qid){
                id[i] = pid;
            }
        }
    }
}
