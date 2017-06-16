import java.util.Scanner;


public class Sum {
public static void main(String[] args){
	int number;
	int sum1=0;
	System.out.println("Enter the number");
	Scanner s1=new Scanner(System.in);
	number=s1.nextInt();
	for(int i=0; i<=number;i++){
		sum1+=i;
	}
	System.out.println("The value of sum is :" +sum1);
	
		
	}
	
	
	
}


