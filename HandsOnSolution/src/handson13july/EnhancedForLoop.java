package handson13july;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arrSize=sc.nextInt();
		int numbers[]=new int[arrSize];
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}
		for(int element : numbers)
		{
			sum += element;
		}
		System.out.println("Total elements of numbers array is : "+sum);
		/*String arr[]= {"Apple","Mango","Banana","Pine apple","Grapes"};
		for(String i:arr)
		{
			System.out.println("arr Array Element : "+i);
		}
		*/
	}

}
