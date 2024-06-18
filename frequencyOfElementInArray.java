public class frequencyOfElementInArray {
    public static void main(String[] args) {
        int a[] = {5,5,5,6,2,5,4,3,3,3,7,4,7,7,7};
        int n = a.length;
        for(int i= 0 ; i<n ; i++)
        {
            int cnt = 0 ; 
            for(int  j = 0 ; j < n ; j++)
            {
                if(a[j] == a[i])
                {
                    cnt++;
                }
            }
            System.out.println("The number of elements of " + a[i] + " is "+cnt);
        }
    }
    
}
