import java.util.Scanner;


public class SumOfN {
public static void main(String[] args){
	System.out.println("Enter th value of N:");
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	int sum=0;
	for(int i=0;i<=N;i++){
		sum=sum+i;
	}
	System.out.println("The value of sum is:" +sum);
	
}
}
