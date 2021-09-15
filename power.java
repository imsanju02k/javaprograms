import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner Object =new Scanner(System.in);
		int basenumber = Object.nextInt();
		int exponent = Object.nextInt();
		long temp=1;
		for(;exponent!=0;--exponent){
		    temp*=basenumber;
		}
		System.out.println("result: " + temp);
	}
}


// System.out.println(Math.pow(basenumber,exponent));