//
Take a set which stores unique list of Arrays
here we contain three loops i and j are fixed and k iterates to last and the j increments and d=stays constant and k iterates
and the process continues until the j is until reaches end and i increments and stays constant ans j becomes one position ahead of
i and stays constant and the process repeats until i reaches end 
when k iterates we try to find nums[i]+nums[j]+nums[k]==0 if yes
we create a list temp array to store the list of three elements
we sort that temp inorder to eleminate duplicates to store in set and we add that temp to set and last we create ans nested list
to store answer of set elements ansd return that ans

*** TIME COMPLEXITY=O(N^3 * log(no. of unique triplets))
    SPACE COMPLEXITY=O(2 * no. of the unique triplets) ***
//


import java.util.*;
class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
      
         Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
       List<List<Integer>> ans = new ArrayList<>(st);
    return ans;

    }
}
