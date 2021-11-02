import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
    	
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter First 1 subject's Marks");
        int subject1=s.nextInt();
        
        System.out.println("Enter First 2 subject's Marks");
        int subject2=s.nextInt();
        
        System.out.println("Enter First 3 subject's Marks");
        int subject3=s.nextInt();
        
        if (subject1>=60 && subject2>=60 && subject3>=60) {
            System.out.println("Passed");
        }
        else if ((subject1>=60 && subject2>=60) || (subject2>=60 && subject3>=60) || (subject3>=60 && subject1>=60 )) {
            System.out.println("Promoted");
        }
        else if(subject1>60 || subject2 >60 || subject3>60 || (subject1<60 && subject2<60 && subject3<60)) {
            System.out.println("Failed");
        }
        else
        {
            System.out.println("entered data is invalid");
        }
    }
}
