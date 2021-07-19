package handson13july;
import java.util.Scanner;

public class IfControlFlow13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		if(input1>input2)
		{
			if(input1>input3)
			{
				System.out.println("the greatest number is input1 : "+input1);
			}
		}
		else if(input2>input3)
		{
			System.out.println("the greatest number is input2 : "+input2);
		}
		else
		{
			System.out.println("the greatest number is input3 : "+input3);
		}
	}

}
