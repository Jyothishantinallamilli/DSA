class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            a.add(count);
        }
        for(int i=0;i<nums.length;i++){
            if(a.get(i)>1){
                return true;
            }
        }
        return false;
    }
}
