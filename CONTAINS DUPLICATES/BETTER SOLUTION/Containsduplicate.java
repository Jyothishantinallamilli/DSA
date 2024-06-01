//
first sort the array 
and check whether the current element and next element is same if yes return true that it contains duplicate elements
else return false

*** TIME COMPLEXITY=O(nlogn)
    SPACE COMPLEXITY=O(1) ***
    
//


class Containsduplicate {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    return true;
                }
        }
       return false;
    }
}
