class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int i,j;
        HashMap<Integer,Integer> map=new HashMap<>();
        for( i=0;i<nums.length;i++){
            int a=nums[i];
            int required=target-a;
            if(map.containsKey(required)){
                ans[0]=map.get(required);
                ans[1]=i;
            }
            map.put(nums[i],i);

        }
        return ans;
    }
}