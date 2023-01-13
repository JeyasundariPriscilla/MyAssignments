package assigments.day6;

import java.util.Arrays;

public class SingleNumberEx1 {

	public static void main(String[] args) {
		int[] nums= {2,2,1};
		Arrays.sort(nums);
		int []vis=new int[nums.length];
		for(int i=0;i<nums.length-1;i++){
		if(nums[i]==nums[i+1]){
		vis[i]=1;
		vis[i+1]=1;
		}
		}
		for(int i=0;i<nums.length;i++){
		if(vis[i]!=1){
		System.out.print(nums[i]);
		}
		}

	}

}
