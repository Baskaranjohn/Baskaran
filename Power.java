import java.util.Scanner;


public class Power {
	public static void main(String[] args){
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("Enter the power value:");
		int pow=s.nextInt();
	    int ans=(int) Math.pow(num,pow);
		System.out.println("The power of a given number is:"+ans);
	}

}
