package javachallenge.eight;

public class Jc8Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1};
		int k=3;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int value=Math.abs(i-j);
			 if(nums[i]==nums[j] && value<=k)
			 {
				 System.out.println("true");
				 
				 
			 }
			 
			
			}
		}

	}



}
