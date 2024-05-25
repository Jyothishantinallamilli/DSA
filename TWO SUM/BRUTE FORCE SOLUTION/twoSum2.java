class twoSum2 {
    public String twoSum2(int[] nums, int target) {
        int i,j;
        for( i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                  return "yes"
                }
            }
        }
        return "no";
    }
}