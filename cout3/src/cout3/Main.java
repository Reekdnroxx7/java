package cout3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	        	double a=sc.nextDouble();
	        	String j=String.valueOf(a);
	        	int cout=0;
	        	char []b=j.toCharArray();
	        	for(int i=0;i<j.length();i++)
	        	{
	        		if(b[i]>'0'&&b[i]<'9')
	        			cout=cout+b[i]-48;		
	        	}
	        		System.out.println(cout);
	        }
	}

}
