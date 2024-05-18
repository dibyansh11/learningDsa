public class unionFind {
    private int id[];
    //union
    //constructior 
    private unionFind(int N)
    {
        id = new int[N];
        for(int i = 0 ; i < N ; i++ )
        {
            id[i] = i ; 
        }
    }
    //connected
    boolean connectedUf(int p  , int q )
    {
        return id[p] == id[q];
    }

    //union 
    public void union(int p  , int q )
    {
        int pid = id[p];
        int qid = id[q];

        for(int i = 0 ; i < id.length ; i++ )
        {
            if(id[i] == pid)
            {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        unionFind uf = new unionFind(5);
        uf.union(3, 4);
        uf.union(1, 2);
        boolean con = uf.connectedUf(3, 4);
        System.out.println(con);
    }
}