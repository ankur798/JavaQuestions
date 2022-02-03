import java.util.*;
public class PatternStar {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.print("ENTER ROWS : ");
     int num =sc.nextInt();
     for(int i=1;i<=num;i++)
     {
    	 if(i==1||i==num)
    	 {
		   System.out.println("********************");
    	 }
    	 else
    	 {
    		 System.out.println("*                  *");
    	 }
     }
     
    sc.close();
	}

}
