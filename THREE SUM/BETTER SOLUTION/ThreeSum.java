//
We create set to store the unique array elements 
we take another set which reintializes every time when i gets incremented  and j is next to position of i
here we use third variable we contains the required value to become Zero
and check whether the third contains in the hashset if yes create a list temp to store list of three elements
and sort the temp to eliminate duplications of arrays and add to set which we created at first
if third is not in hashset the add that third to hashset and finally cretae a nested list of ans to sore the set
as the set is list we convert to nested by taking ArrayList and return the ans

*** TIME COMPLEXITY=O(N2 * log(no. of unique triplets))
    SPACE COMPLEXITY=O(2 * no. of the unique triplets) + O(N)  ***

//



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
