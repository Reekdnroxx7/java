package cout;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while (in.hasNextInt()) {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            if(a>1000)
	        	      System.out.println("a<=1000");
	            else  
	            	{
	            	System.out.println(a + b);
	            	}
	        }
	    }
}

