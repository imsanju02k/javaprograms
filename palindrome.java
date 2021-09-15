import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner Object =new Scanner(System.in);
		System.out.println("enter the Number/String");
		String reverse="";
		String Number=Object.nextLine();
		int length = Number.length();
		for (int i=length-1;i>=0 ;i-- )
		  reverse=reverse+Number.charAt(i);
		if(Number.equals(reverse))
		   System.out.println("enter the Number/String is a palindrome");
		else
	       System.out.println("enter the Number/String is not a palindrome");

	}
}
