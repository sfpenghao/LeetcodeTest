package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.parallelSort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(k>j){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                    while(k>j && nums[k]==nums[k+1]) k--;
                    while(k>j && nums[j]==nums[j-1]) j++;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
}
