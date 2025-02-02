class Tree
{
    private int count=0;
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	    coun(root,X);
	    return count;
	    
	
    }
     int coun(Node root,int x){
        if(root==null)return 0;
        
        int lef=coun(root.left,x);
        int rig=coun(root.right,x);
        
        int sum=root.data+lef+rig;
        
        if(sum==x){
            count++;
        }
        return sum;
    }
}
