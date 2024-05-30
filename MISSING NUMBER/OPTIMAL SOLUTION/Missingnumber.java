//
here we take expectedsum as  sum of first n natural numbers
we initialize sum=0
taking for loop we add array elements to the sum 
now the expectedsum-sum gives you missing element
return that

*** TIME COMPLEXITY=O(n)
    SPACE COMPLEXITY=O(1) ***

//



class Missingnumber {
    public int missingNumber(int[] nums) {
        int x=nums.length;
        int expectedsum=x*(x+1)/2;
        int sum=0;
        for(int i=0;i<x;i++){
            sum+=nums[i];
        }
        return expectedsum-sum;
    }
}