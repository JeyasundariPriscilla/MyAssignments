package assigments.day7;

public class HappyNumberEx2 {

	public static void main(String[] args) {
		int n=2;
		int temp=n;
		int m;
		int count=0;
		HappyNumberEx1 placeValue=new HappyNumberEx1();
				do{
			count=count+1;
			m= placeValue.ones(temp)*placeValue.ones(temp)+placeValue.tens(temp)*placeValue.tens(temp)+placeValue.hundreds(temp)*placeValue.hundreds(temp);
			System.out.println(m);
			System.out.println(count);
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
