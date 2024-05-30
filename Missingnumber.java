//
  we sorting an array 
    and taking a loop to check whether the i value is equal to nums[i] as the array is sorted everything will be ascending order
    when it not matches we return i value
    if there is no missing element from 0 to x-1 then return x

    *** TIME COMPLEXITY=O(nlogn)
        SPACEE COMPLEXITY=O(1) ***
    
//


class Missingnumber {
    public int missingNumber(int[] nums) {
        int x=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<x;i++){
            if( nums[i]!=i){
                return i;
            }
        }
        return x;
    }
}
