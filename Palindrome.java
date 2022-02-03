import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER NUMBER : ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int count=0;
		int left=0;
		int right=0;
		
		
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			count++;
			temp=temp/10;
		}
		System.out.println(rev);
		if(rev==num)
		{
			System.out.print("NUMBER IS PALINDROME : "+num);
		}
		else
		{
		    left=num/(int)Math.pow(10,(count/2));
			int revTemp=left;
			while(revTemp!=0)
			{
				right=right*10+revTemp%10;
				revTemp=revTemp/10;
			}
			left=left/10;
			System.out.println((int)Math.pow(10,count/2));
			int tempRight=(left*(int)Math.pow(10,(count/2)+1))+right;
			if(tempRight>num)
			{
				System.out.println("NEAR PALINDROME is : "+tempRight);
			}
			else
		{      System.out.println("NEAR PALINDROME is : "+(tempRight+(int)Math.pow(10, (count/2))));
			}
		}
		
		sc.close();

	}

}
