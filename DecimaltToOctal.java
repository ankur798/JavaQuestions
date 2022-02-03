import java.util.*;
public class DecimaltToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER NUMBER : ");
         int num=sc.nextInt();
         int rem=0;
         int octNum=0;
         int numCopy=num;
         
         while(num!=0)
         {
        	 
        	 rem=rem*10+num%8;
        	 num=num/8;
         }
        
         while(rem!=0)
         {
        	 octNum=octNum*10+(rem%10);
        	 rem=rem/10;
         }
         if(numCopy%8==0)
         {
        	 octNum=octNum*10;
         }
         System.out.print("OCTAL NUMBER = "+ octNum);
         sc.close();
         
	}

}
