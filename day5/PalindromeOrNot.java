package assigments.day5;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal:Panama";
		String s1=s.replaceAll(",", "");
		String s2=s1.replaceAll(":","");
		String s3=s2.replaceAll(" ", "");
		//System.out.println(s3);
		String reverse ="";
		for(int i=s3.length()-1;i>=0;i--)
		{
		 reverse = reverse + s3.charAt(i);
		}
		if(reverse.equalsIgnoreCase(s3))
		{
			System.out.println("true ");
		}
		else 
		{
			System.out.println("false");
		}
		
		
		
			
			
			
		
			
			
		}
		
	}


