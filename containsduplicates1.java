class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        for(int i=0;i<nums.length;i++){
          for(int j=nums.length-1;j>i;j--){
            if(nums[i]==nums[j])
            return true;
          }
        }
        return false;
    }
}
