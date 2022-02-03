import java.util.*;
public class Parenthesis {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("ENTER BRACKETS : ");
		String str = sc.next();
		Stack<Character> s=new Stack<>();
		boolean isFinished=false;
		
		if(str.charAt(0)=='}'||str.charAt(0)==']'||str.charAt(0)==')')
		{
			System.out.print("NOT PROPERLY NESTED INDEX : "+0);
		}
		else
		{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
			{
				s.push(str.charAt(i));
			}
			else
			{
				if(s.empty())
				{
					System.out.println("Not Nested "+i);
					break;
					
				}
				else
				{
				if(s.peek()=='('&&str.charAt(i)==')')
				{
					s.pop();
				}
				else if(s.peek()=='{'&&str.charAt(i)=='}')
				{
				s.pop();
				}
				else if(s.peek()=='['&&str.charAt(i)==']')
				{
				s.pop();
				}
				else
				{
					System.out.print("Wrong Bracket at INDEX : "+(i));
					break;
					
				}
			}
			}
			if(i==str.length()-1)
			{
				isFinished=true;
			}
			
			
			
		}
		if(isFinished)
		{
			if(s.empty()==false)
			{
		if(s.peek()=='{'||s.peek()=='['||s.peek()=='(')
		{
			System.out.print("Wrong Bracket at INDEX : "+(str.length()));
		}
		}
			else
			{
				System.out.print("BRACKETS ARE NESTED");
			}
		}
		
		

	}

	}
}
