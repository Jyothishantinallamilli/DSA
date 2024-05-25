class maxSubArray {
    public int maxSubArray(int[] nums) {
        int i,j,k;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int sum=0;
                for(k=i;k<=j;k++){
                    sum+=nums[k];
                    maxi=Math.max(maxi,sum);
                }
                
            }
        }
        return maxi;
    }
}