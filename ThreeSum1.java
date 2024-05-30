  import java.util.*;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      
        int third;
         HashSet<List<Integer>> st=new HashSet<>();
         for(int i=0;i<nums.length;i++){
             HashSet<Integer> hashset=new HashSet<>();
             for(int j=i+1;j<nums.length;j++){
                   third=-(nums[i]+nums[j]);
                   if(hashset.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                   }
                   hashset.add(nums[j]);
             }
         }
       List<List<Integer>> ans = new ArrayList<>(st);
    return ans;

    }
}
