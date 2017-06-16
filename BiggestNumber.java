package guvi;

import java.util.Scanner;

public class BiggestNumber {
public static void main(String args[]){
	int a;
	int b;
	int c;
    Scanner ss=new Scanner(System.in);
	System.out.println("Enter a");
	System.out.println("Enter the b");
	System.out.println("Enter the c");
	a=ss.nextInt();
	b=ss.nextInt();
	c=ss.nextInt();
	if(a>b&&c<a){
		System.out.println("The value of a is larger" +a);
	}
	if(b>a&&b>c){
		System.out.println("The value b is larger" +b);
	}
	else{
		System.out.println("The value c is larger" +c);
	}
	}
	
}

