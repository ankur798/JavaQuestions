import java.util.*;

class Table{
	
	void PrintTable(int n)
	{
		for (int i=1;i<=10;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+"*"+i+"="+(i*j)+", ");
			}
			System.out.println("");
		}
	}
}
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Table t=new Table();
		t.PrintTable(n);
		sc.close();
	}
	

}
