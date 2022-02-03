import java.util.*;

public class StringEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER STRING : ");
		String str=sc.next();
		TreeSet<Integer> set =new TreeSet<>((o1,o2)->o2-o1);
		
		for(int i=0;i<str.length();i++)
			
		{
			switch(str.charAt(i))
			{
			case '0':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '1':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '2':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '3':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '4':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '5':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '6':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '7':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '8':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
			case '9':
				set.add(Integer.parseInt(Character.toString(str.charAt(i))));
				break;
				default:
					continue;
			}
			
		}
		String num=set.toString();
		
		int evenNumber=0;
		
		for(int i=0;i<num.length();i++)
		{
			switch(num.charAt(i))
			{
			case '0':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '1':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '2':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '3':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '4':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '5':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '6':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '7':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '8':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			case '9':
				evenNumber=evenNumber*10+Integer.parseInt(Character.toString(num.charAt(i)));
				break;
			}
				
			
			
		   
		}
		if(evenNumber%2==0)
		{
			System.out.println("EVEN NUMBER FROM STRING IS : "+evenNumber);
		}
		else
		{
			int lastDigit=0;
			int temp=evenNumber;
			for(int i=0;i<2;i++)
			{
				lastDigit=lastDigit*10+temp%10;
				temp=temp/10;
			}
			temp=temp*100+lastDigit;
			if(temp%2==0)
			{
				System.out.println("EVEN NUMBER FROM STRING IS : "+temp);
			}
			else
			{
				System.out.println("NO EVEN NUMBER FOUND : -1 ");
			}
		}
		sc.close();
	
	    
	    
		

	}

}
