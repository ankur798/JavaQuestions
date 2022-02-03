import java.util.*;
public class APSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the starting number of the A.P. series: ");
		int first=sc.nextInt();
		System.out.print("Input the number of items for the A.P. series: ");
		int num=sc.nextInt();
		System.out.print("Input the common difference of A.P. series: ");
		int diff=sc.nextInt();
		int result=0;
		for(int i=0;i<num;i++)
		{
			result=result+(first+i*diff);
			System.out.print((first+i*diff)+" + ");
		}
		System.out.print("= "+result);
       sc.close();
	}

}
