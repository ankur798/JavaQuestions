
import java.util.*;

class Sum
{
    void seriesSum(int n)
	{
    	 double result=0;
		for(int i=1;i<=n;i++)
		{
			result=result+(1.00/i);
		}
		System.out.println("");
		System.out.println(result);
	}
}
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE N : ");
		int n=sc.nextInt();
		
	  for(int i=1;i<=n;i++)
	  {
		  System.out.print("1/"+i+"+");
	  }
		
		Sum s=new Sum();
		s.seriesSum(n);
		sc.close();

	}
	
  
	

}
