package assigments.day6;

import java.util.Arrays;

public class SingleNumberEx2 {

	public static void main(String[] args) {
		int[] nums= {4,1,2,1,2};
		Arrays.sort(nums);
		int []nums1=new int[nums.length];
		for(int i=0;i<nums.length-1;i++){
		if(nums[i]==nums[i+1]){
		nums1[i]=1;
		nums1[i+1]=1;
		}
		}
		for(int i=0;i<nums.length;i++){
		if(nums1[i]!=1){
		System.out.print(nums[i]);
		}
		}
		
		
		

	}

}
