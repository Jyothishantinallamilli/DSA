class maxProd {
    public int maxProduct(int[] nums) {
        int i,j,k;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int prod=1;
                for(k=i;k<=j;k++){
                    prod*=nums[k];
                }
                maxi=Math.max(maxi,prod);
            }
        }
        return maxi;
    }
}