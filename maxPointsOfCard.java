public class maxPointsOfCard {
    public static int fn(int [] arr , int k ){
        int n = arr.length;
        int lsum =  0 , rsum =  0 , totalSum = 0 ; 
        for(int i = 0  ; i < k ; i++){
            lsum+= arr[i];
        }
        totalSum = lsum ; 
        int rind = n-1 ; 
        for(int i = k-1 ; i>=0 ; i--){
            lsum -=arr[i];
            rsum += arr[rind];
            rind--;
            totalSum = Math.max(totalSum, lsum+rsum);
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int arr[] = {6, 2,3,4,7,2,1,7,1};
        int res = fn(arr, 4);
        System.out.println(res);
        
    }
}