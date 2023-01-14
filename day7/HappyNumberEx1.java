package assigments.day7;

public class HappyNumberEx1 {
	
	public int ones(int temp) {
		int ones=temp%10;
		return ones;
		}
	public int tens(int temp) {
		int tens=(temp%100)/10;
		return tens;
	}
	public int hundreds(int temp) {
		int hundreds=(temp%1000)/100;
		return hundreds;
	}

	public static void main(String[] args) {
		int n=19;
		int temp=n;
		int m;
		int count=0;
		HappyNumberEx1 placeValue=new HappyNumberEx1();
				do{
			count=count+1;
			m= placeValue.ones(temp)*placeValue.ones(temp)+placeValue.tens(temp)*placeValue.tens(temp)+placeValue.hundreds(temp)*placeValue.hundreds(temp);
			System.out.println(m);
			temp=m;
			}
		while(temp!=1 && count<=10);
		if(temp==1 && count<10)
		{
		System.out.println("true");
		}
		else System.out.println("false");
		
		
		
		
		

	}

}
