package handson13jul;
import java.util.Scanner;

public class Switch13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		int	month=sc.nextInt();
		int year=sc.nextInt();
		int i=0;
		if(year>1990 && year<=1995)
		{
			i=1;
		}
		else if(year>1995 && year<=2000)
		{
			i=2;
		}
		else if(year>2000 && year<=2010)
		{
			i=3;
		}
		else if(year>2010 && year<=2021)
		{
			i=4;
		}
		
		switch(i)
		{
		case 1:
			System.out.println("Early 90's Born");
			break;
		case 2:
			System.out.println("Late 90's Born");
			break;
		case 3:
			System.out.println("New Decade Born");
			break;
		case 4:
			System.out.println("Recently Born");
			break;
		default:
			System.out.println("Invalid Year");
		}

	}

}
