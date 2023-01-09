package week1.day2;

public class lastwordlenghtex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="  fly me  to  the moon ";
    String trim = s.trim();
    String[] split = trim.split(" ");
    System.out.println("Output:" + split[split.length-1].length());
    
	}

}
