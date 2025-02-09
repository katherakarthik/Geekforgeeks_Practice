class Solution {
    int countStrings(int n) {
        
        if(n==0){
            return 1;
        }
        
        // code here
        long a[]=new long[n+2];
        long b[]=new long[n+2];
        
        a[1]=1;
        b[1]=1;
        
        for(int i=2;i<=n;i++){
            a[i]=(a[i-1]+b[i-1]);
            b[i]=a[i-1];
        }
        long total=a[n]+b[n];
        return (int)total;
        
        
    }
}
