import java.util.*;
public class HCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int first=sc.nextInt();
		System.out.print("ENTER SECOND NUMBER: ");
		int second =sc.nextInt();
		int hcf=0;
		
		for(int i=1;i<=first && i<=second;i++)
		{
			if(first%i==0 && second%i==0)
			{
				hcf=i;
			}
		}
		System.out.print("HCF of "+first+" AND "+second +" is "+ hcf);
		sc.close();

	}

}
