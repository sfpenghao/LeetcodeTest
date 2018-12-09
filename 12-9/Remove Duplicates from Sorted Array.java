class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        int count = 0;
        for(int i=1;i<len;i++){
            if(nums[count]==nums[len-1]) break;
            if(nums[count]!=nums[i]){
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}
