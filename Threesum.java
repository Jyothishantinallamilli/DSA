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
