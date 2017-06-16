package baskar;

import java.util.Scanner;

public class Count {
	public static void main(String[] args){
		long number;
		int sum=0;
		System.out.println("Enter the Integer");
		Scanner s1=new Scanner(System.in);
		number=s1.nextInt();
		while(number>0){
			number=number/10;
			++sum;
		}
		System.out.println("the value is :"+sum);
		}
		}
		
	


