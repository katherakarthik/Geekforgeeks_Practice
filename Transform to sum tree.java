class Solution{
    public void toSumTree(Node root){
         //add code here.
        int fg= height(root);
    }
    public int height(Node root){
        if(root==null)return 0;
        int lef=height(root.left);
        int rig=height(root.right);
        int temp=root.data;                          //Time complexity O(N)
        root.data=lef+rig;
        return temp+lef+rig;
    }
}
