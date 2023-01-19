package javachallenge.six;

import java.util.Arrays;

public class MajorityEx2 {

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		int count=1;
		Arrays.sort(nums);
		int maxcount=0;
		int index=0;
		for(int i=0;i<nums.length-1;i++)
		{
		 for(int j=1;j<nums.length-1;j++)	
		 {
			 if(nums[i]==nums[j])
			 {
				count=count+1;
			 }
			 if(count>maxcount)
			 {
				maxcount=count;
				index=i;
			 }
		 }
		}
		if (maxcount>nums.length/2)
		{
			System.out.println("majority element:" + nums[index]);
		}

	}

}
