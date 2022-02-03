import java.util.*;
public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER: ");
		int first =sc.nextInt();
		System.out.print("ENTER LAST NUMBER: ");
		int last=sc.nextInt();
		boolean flag=false;
		
		for(int i=first;i<=last;i++)
		{ flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{System.out.print(i+" ");}
		}
		sc.close();

	}

}
