//
we take two for loops one for the n values and other for pointing to array elements 
intially we make found=false for every i value
j check the array element that matches with i value if yes make found as true and break if found there is no need to check other 
elements finally if found=false then return the i value
else return -1

*** TIME COMPLEXITY=O(n^2)
    SPACE COMPLEXITY=O(1) ***

//




class Missingnumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1; 
    }
}
