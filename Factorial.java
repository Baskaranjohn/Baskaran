import java.util.Scanner;


public class Factorial {
	public static void main(String[] args){
		System.out.println("Enter the Number to find the Factorial:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of a given number is:" +fact);
	}

}
