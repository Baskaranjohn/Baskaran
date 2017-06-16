import java.util.Scanner;


public class LeapYear {
public static void main(String[] args){
	long year;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the year");
	year=s1.nextInt();
	if(year%4==0){
		System.out.println("The year is leap year");
	}
	else{
		System.out.println("The year is not leap year");
		
	}
}
}

