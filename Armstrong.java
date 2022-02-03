import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER STARTING NUMBER: ");
		int start=sc.nextInt();
		System.out.print("ENTER ENDINGING NUMBER: ");
		int end=sc.nextInt();
		int result=0;
		
		for(int i=start;i<=end;i++)
		{
			result=0;
			int temp=i;
			int count=0;
			while(temp!=0)
			{
				count++;
				temp=temp/10;
			}
			int temp1=i;
			while(temp1!=0)
			{
			  result=result+(int)Math.pow((temp1%10),count);
			  temp1=temp1/10;
			}
			if(result==i)
			{
				System.out.print(i+" ");
			}
			sc.close();
		}
		
		

	}

}
