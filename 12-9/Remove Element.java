class RemoveElement {
    //approach1:
    public int removeElement1(int[] nums, int val) {
        int res =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[res]=nums[j];
                res++;
            }
        }
        return res;
    }
    //approach2:
    public int removeElement2(int[] nums, int val) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
}
