
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			
		for(int i=1;i<a.length;i++)
		{
			int x=a[i];
			int j=i-1;
			while(j>=0&&a[j]>x)
			{
				a[j+1]=a[j];
				j=j-1;
				
			}
			a[j+1]=x;
		}
		for(int i=a.length-1;i>0;i--)
		{
			int z=a[i];
			if(z==a[i-1])
			{
				continue;
			}
			else
			{
				System.out.println(a[i-1]);
				break;
			}
			
		}
		sc.close();

	}

}
