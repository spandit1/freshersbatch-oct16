
public class armstrongRange {

	public static void main(String[] args) {
		
		
		for(int k=100;k<=1000;k++){
			int n = k;
			int r = 0;
			int sum = 0;
		
			while(n>0) {
				r = n % 10;
				n = n / 10;
				sum = sum + r*r*r;
			}
			if(k==sum)
				System.out.println( k+" "+"is a armstrong number");
			
		}

	}

}
