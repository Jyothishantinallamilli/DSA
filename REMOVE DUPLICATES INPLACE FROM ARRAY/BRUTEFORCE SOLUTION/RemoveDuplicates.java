class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            nums[j++] = x;
        }
        return k;
    }
   
}