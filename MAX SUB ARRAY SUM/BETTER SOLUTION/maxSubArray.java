class maxSubArray {
    public int maxSubArray(int[] nums) {
        int i,j;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(i=0;i<n;i++){
            int sum=0;
            for(j=i;j<n;j++){
                    sum+=nums[j];
                    maxi=Math.max(maxi,sum);
                }   
            }
        return maxi;
    }
}