import java.util.Scanner;


public class HelloPrint {
public static void main(String[] args){
	System.out.println("Enter the string to print:");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	System.out.println("Enter the value for print the string");
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		System.out.println(str);
	}
}
}
