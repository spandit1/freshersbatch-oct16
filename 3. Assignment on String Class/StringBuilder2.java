package assignment3;
public class StringBuilder2 {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("It is used to_ at the specified index position.");
		
		sb.replace(13, 14, " insert text");
		
		System.out.println(sb);
	}

}
