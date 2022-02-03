import java.util.*;
public class Parenthesis {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("ENTER BRACKETS : ");
		String str = sc.next();
		Stack<Character> s=new Stack<>();
		
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
			else if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')')
			{
				if(s.empty())
				{
					break;
				}
				else
				{
				s.pop();
				}
			}
			else
			{
				System.out.println("STRING CONTAINS OTHER CHARACTERS");
				break;
			}
			
		}
		
		if(s.empty())
		{
			System.out.print("Brackets Are NESTED");
		}
		else
		{
			System.out.print("Brackets Are NOT NESTED");
		}
		}

	}

}
