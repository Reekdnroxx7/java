package cout2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 int cout=0;
		 Scanner sc = new Scanner(System.in);
	        while (sc.hasNextInt()) {
	        String str=sc.nextLine();
	        String b=str;
	        int numStu = Integer.parseInt(str); 
	        if( (numStu>10000||numStu==10000)&&(numStu<20000||numStu==20000)){
	        	System.out.print(Integer.toBinaryString(numStu)+",");
	        	System.out.print(Integer.toOctalString(numStu)+",");
	        	System.out.println(Integer.toHexString(numStu));
	        	}
	        	else
	        	{
	        		char a[]=b.toCharArray();
	        		if(a[0]=='-')
	        		{
	        			 cout=0;
	        			for(int i=1;i<str.length();i++)
	        				{
	        				System.out.print(a[i]+" ");
	        			    cout=cout+a[i]-48;	
	        				}
	        		}
	        		else
	        		{
	        			 cout=0;
	        			for(int i=0;i<str.length();i++)
	        			{
	        				System.out.print(a[i]+" ");
	        			    cout=cout+a[i]-48;
	        			}
	        		}
	        		System.out.println(cout);
	        	}
	        	}
	        }
	        	
	
	}

