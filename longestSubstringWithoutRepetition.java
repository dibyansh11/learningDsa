public class longestSubstringWithoutRepetition {
    public static int better(char arr[] ){
        int l = 0  , r = 0 , len = 0 , maxLen = 0 ; 
        int n = arr.length;
        int map[] = new int[256];
        for(int i = 0 ;  i < 256 ; i++){
            map[i]= -1 ; 
        }
        while(r < n ){
            if(map[arr[r]] >= l){
                if(map[arr[l]] >= l){
                    l = map[arr[r]] +1 ; 
                }
                
            }
            len = r-l+1 ; 
            maxLen = Math.max(len, maxLen);
            map[arr[r]] = r; 
            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        char [] s = {'c','a','d','b','z','a','b','c','d'};
        int res = better(s);
        System.out.println("Better Approach :: " + res );
        //bruteforce 
        int len = 0 , maxLen = 0 ; 
        for(int i = 0 ; i < s.length ;i++){
            int[] hash = new int[256];
            for(int j = i ; j < s.length ; j++){
                if(hash[s[j]] == 1) break;
                len = j-i+1;
                maxLen = Math.max(len , maxLen);
                hash[s[j]] = 1 ; 
            }
        }
        System.out.println("BruteForce ::  " + maxLen);
    }
}