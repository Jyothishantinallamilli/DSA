class maxProd {
    public int maxProduct(int[] nums) {
        int i,j,k;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
             int prod=1;
            for(j=i;j<n;j++){
                    prod*=nums[j];
                maxi=Math.max(maxi,prod);
            }
        }
        return maxi;
    }
}