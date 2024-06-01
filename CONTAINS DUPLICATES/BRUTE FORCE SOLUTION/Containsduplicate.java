//
take two loops i loop iterates on each element and j loop iterates from i+1 index and checks the elemnent at j is equal to 
element at i if yes return true else return false

*** TIME COMPLEXITY=O(n^2)
    SPACE COMPLEXITY=O(1) ***
    
//


class Containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j])
            return true;
          }
        }
        return false;
    }
}
