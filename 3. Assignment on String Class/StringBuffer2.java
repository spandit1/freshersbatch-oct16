package assignment3;
public class StringBuffer2 {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("It is used to_ at the specified index position.");
		
		sb.replace(13, 14, " insert text");
		
		System.out.println(sb);
	}

}
