package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
	        int result = nums[0]+nums[1]+nums[2];
	        Arrays.parallelSort(nums);
	        for(int i=0;i<nums.length-2;i++){
	            if(i!=0&&nums[i]==nums[i-1]) continue;
	            int j=i+1,k=nums.length-1;
	            while(k>j){
	                int sum = nums[i]+nums[j]+nums[k];
	                if((sum-target)*(sum-target)<(result-target)*(result-target)){
	                    result = sum;
	                    if(result==target)
	                        return result;
	                }
	                if(sum>target){
	                    k--;
	                    while(k>j && nums[k]==nums[k+1]) k--;
	                }else{
	                    j++;
	                    while(k>j && nums[j]==nums[j-1]) j++;
	                }
	            }
	        }
	        return result;
	    }
}

