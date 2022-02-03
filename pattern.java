
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENETER ROWS: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
