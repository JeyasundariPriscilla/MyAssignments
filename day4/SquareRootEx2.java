package assigments.day4;

public class SquareRootEx2 {

	public static void main(String[] args) {
		int x=8;
		for(int i=1;i<x;i++)
		{
			if(x==i*i)
			{
				System.out.println(i);
			}
			else 
			{
				int j=i+1;
//if number is greater than square of i and less than square of j,
//then square root of number lies between i and j
				if(x>i*i && x<j*j)
				{
				 System.out.println(i);
				 
				}
				else 
				continue;
			}
		}
	}

}
