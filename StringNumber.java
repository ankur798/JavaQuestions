import java.util.*;
public class StringNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER STRING : ");
		String myString=sc.next();
		int num1=0;
		int num2=0;
		int index=0;
		String temString="0";
		for(int i=0;i<myString.length();i++)
		{
			if(myString.charAt(i)!='5')
			{if(i%2==0)
			{
				num1=num1+Integer.parseInt(Character.toString(myString.charAt(i)));
			}
			}
			else
			{
				index=i;
				break;
			}
		}
		
		for(int j=index;j<myString.length();j++)
		{
			if(myString.charAt(j)!='8')
			{
			if(j%2==0)
			{
				temString=temString+Character.toString(myString.charAt(j));
			}
			}
			else
			{
				temString=temString+Character.toString(myString.charAt(j));
				index=j+1;
				break;
			}
		}
		for(int i=index;i<myString.length();i++)
		{
			
			if(i%2==0)
			{
				num1=num1+Integer.parseInt(Character.toString(myString.charAt(i)));
			}
			
		}
		num2=Integer.parseInt(temString);
		System.out.print("SUM of "+num1+" + "+num2+" = "+(num1+num2));
		sc.close();
		
		

	}

}
