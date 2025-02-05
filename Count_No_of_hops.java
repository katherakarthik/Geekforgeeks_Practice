class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        // add your code here
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        int k=clim(n,arr);
        return k;
        
    }
    static int clim(int n,int arr[]){
        if(n==0){
            return 1;
        }
        if(n==1||n==2){
            return n;
        }
        if(arr[n]!=-1)return arr[n];
        
        arr[n]=clim(n-1,arr)+clim(n-2,arr)+clim(n-3,arr);
        return arr[n];
    }
}
