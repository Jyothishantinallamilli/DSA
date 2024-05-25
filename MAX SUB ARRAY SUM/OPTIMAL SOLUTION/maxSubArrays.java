class maxSubArray {
    public int maxSubArray(int[] nums) {
        int i;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi)
            maxi=sum;
            if(sum<0)
            sum=0;
        }
        return maxi;
    }
}