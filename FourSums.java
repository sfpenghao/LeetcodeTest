package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSums {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i1=0;i1<nums.length-3;i1++){
            if(nums[i1]+nums[i1+1]+nums[i1+2]+nums[i1+3]>target) break;
            if(nums[i1]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)  continue;
            if(i1!=0&&nums[i1]==nums[i1-1]) continue;
            for(int i2=nums.length-1;i2>i1;i2--){
                if(i2!=nums.length-1&&nums[i2]==nums[i2+1]) continue;
                int j=i1+1,k=i2-1;
                while(k>j){
                    int sum = nums[i1]+nums[i2]+nums[j]+nums[k];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i1],nums[j++],nums[k--],nums[i2]));
                        while(k>j&&nums[j]==nums[j-1]) j++;
                        while(k>j&&nums[k]==nums[k+1]) k--;
                    }else if(sum>target){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
