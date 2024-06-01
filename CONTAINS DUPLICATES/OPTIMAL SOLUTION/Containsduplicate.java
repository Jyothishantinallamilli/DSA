//
take a set which takes the unique elements iterate i from 0 to nums.length
add every element to set but if you try to add same element set dont store it 
compare st.size()<nums.length if yes return true 
else return false


*** TIME COMPLEXITY=O(n)
    SPACE COMPLEXITY=O(n) ***
    
//


class Containsduplicate {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> st=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
      }
      if(st.size()<nums.length)
      return true;
      return false;
    }
}