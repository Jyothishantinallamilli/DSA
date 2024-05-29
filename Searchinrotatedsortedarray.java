//
intilaize l=0 and r=length of array-1 
  the we make m=(l+r)/2 and checks if that mth element equals to target then we return that mth position
  else we check right half if mth element is less than the rth element which means the right part is sorted 
  the we check if the target lies between mth element and rth element then l gets updated to m+1 else r=m-1 if the condition fails
  if right part does contain target then we go and check for left if taget lies between lth element and mth elment then r=m-1
  else l=m+1 if there is no such target found in array we return -1

  *** TIME COMPLEXITY=O(log n)
      SPACE COMPLEXITY=O(1) ***
  
//

class Searchinrotatedsortedarray {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,m;
        while(l<=r){
            m=(l+r)/2;
            if(nums[m]==target){
                 return m;
            }
            else{
                if(nums[m]<nums[r]){
                    if(nums[m]<target && nums[r]>=target){
                        l=m+1;
                    }
                    else{
                        r=m-1;
                    }
                }
                else{
                        if(nums[m]>target && nums[l]<=target){
                        r=m-1;
                        }
                    else{
                        l=m+1;
                    }
                    }
                }
            }


        return -1;
    }
}
