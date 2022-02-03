import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int rev=0;
        int n2=n;
       while(n2!=0)
       {
           count++;
           n2=n2/10;
       }
     
       
       
       for (int i=1;i<=count;i++)
       {
    	   
    	   rev=rev*10+(n%10);
    	   n=n/10;
       }
        System.out.println("Reverse:"+rev);
        sc.close();
	}

}
