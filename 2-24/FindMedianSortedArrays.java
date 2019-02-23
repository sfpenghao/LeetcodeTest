package test;

import java.util.Arrays;

public class FindMedianSortedArrays {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int n1 = nums1.length;
	        int n2 = nums2.length;
	        if(n1==0){
	            return findMid(nums2);
	        }else if(n2==0){
	            return findMid(nums1);
	        }else{
	            int[] res = new int[n1+n2];
	            for(int i=0,i1=0,i2=0;i<n1+n2;i++){
	                if(i1==n1||i2!=n2&&nums1[i1]>=nums2[i2]){
	                    res[i] = nums2[i2];
	                    i2++;
	                }else if(i2==n2||i1!=n1&&nums1[i1]<nums2[i2]){
	                    res[i] = nums1[i1];
	                    i1++;
	                }
	            }
	            return findMid(res);
	        }
	    }
	    
	    public static double findMid(int[] nums){
	        int len = nums.length;
	        if(len%2==1){
	            return (double)nums[(len-1)/2];
	        }else{
	            return (double)(nums[len/2]+nums[len/2-1])/2;
	        }
	    }
	    
	    public static void main(String[] arg1) {
	    	int[] a1 = {1,2};
	    	int[] a2 = {3,4};
	    	findMedianSortedArrays(a1, a2);
	    }
}
