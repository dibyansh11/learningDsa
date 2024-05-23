public class QuickUnion {
    private int id[];

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    private int root(int i) {
        while (i != id[i]) {
            id[i] = i;
        }
        return i;
    }
    boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickUnion uf = new QuickUnion(6);
        uf.union(3, 4);
        uf.union(2, 5);
        uf.union(4, 5);
        boolean res =  uf.connected(3, 5);
        System.out.println(res);

    }
}