import java.util.Scanner;
public class UsernamePass {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the User Name");
        String uname = sc.nextLine();

        System.out.println("Enter the Password");
        String upass = sc.nextLine();

        System.out.println(uname + " Welcome ");

        System.out.println(" Please enter your log in details: ");

            System.out.println("Enter the Username");
            String lname = sc.nextLine();

            System.out.println("Enter the Password");
            String lpass = sc.nextLine();

        while (count <= 2) {

            if ((!uname.equals(lname)) || (!upass.equals(lpass))) {
                System.out.println("WARNING: USERNAME OR PASSWORD MISMATCH");

                System.out.println("Enter the Username");
                lname= sc.nextLine();

                System.out.println("Enter the Password");
                lpass= sc.nextLine();
            } 
            else {
                System.out.println("You are logged in");
                break;
            }
            count++;

        }
        if (count > 2) {
            System.out.println("Please contact admin");
        }

    }
}
