import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int num1=sc.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int num2=sc.nextInt();
		System.out.print("ENTER THIRD NUMBER : ");
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				if(num2>num3)
				{
					System.out.print("SECOND GREATEST "+num2);
				}
				else
				{
					System.out.print("SECOND GREATEST "+num3);
				}
			}
			else if(num1<num3)
			{
				System.out.print("SECOND GREATEST "+num1);
			}
		}
		else if(num2>num3)
		{
			System.out.print("SECOND GREATEST "+num3);
		}
		else
		{
			System.out.print("SECOND GREATEST "+num2);
		}
		sc.close();
		

	}

}
