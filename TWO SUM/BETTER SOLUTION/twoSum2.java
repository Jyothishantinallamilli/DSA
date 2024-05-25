class twoSum2 {
    public String twoSum2(int[] nums, int target) {
        int i,j;
        HashMap<Integer,Integer> map=new HashMap<>();
        for( i=0;i<nums.length;i++){
            int a=nums[i];
            int required=target-a;
            if(map.containsKey(required)){
                return "YES";
            }
            map.put(nums[i],i);

        }
        return "NO";
    }
}