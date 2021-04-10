package cout4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        while (sc.hasNextInt()) {
	        	int cout;
	        	String str=sc.nextLine();
	        	int numStu = Integer.parseInt(str);
	        	String arr=Integer.toBinaryString(numStu);
	        	if(numStu==0)
	        	{
	        		cout=32;
	        	}
	        	else
	        		{
	        		cout=32-arr.length();
	        		}
	              System.out.println(cout);
	        }
	}

}
