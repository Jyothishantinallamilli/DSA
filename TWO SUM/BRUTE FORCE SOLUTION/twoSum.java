class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int i,j;
        for( i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}