import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************** Program to check even / odd number ****************");
		do{
			System.out.println("Enter a whole number: ");
			int num = sc.nextInt();
			if(num%2 == 0)
				System.out.println("Entered number " + num + " is an Even number");
			else
				System.out.println("Entered number " + num + " is an Odd number");
			System.out.println("Do you want to continue?");
			
		} while(sc.next().equals("Y"));
		sc.close();
				
	}
}
