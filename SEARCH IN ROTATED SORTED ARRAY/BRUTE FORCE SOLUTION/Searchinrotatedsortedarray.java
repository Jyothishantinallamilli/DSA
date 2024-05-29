//
its a linear search approach where we comapre every elemnt with target if yes return the ith position
  if there is no such target found in the array the return -1

  *** TIME COMPLEXITY=O(n)
      SPACE COMPLEXITY=O(1) ***
//


class Searchinrotatedsortedarray {
    public int search(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target)
        return i;
      }
        return -1;
    }
}
