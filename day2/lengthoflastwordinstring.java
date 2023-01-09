package week1.day2;

public class lengthoflastwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		String[] split = s.split(" ");
		System.out.println("output:" + split[split.length-1].length());
	}

}
