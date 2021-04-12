package java2;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		      String str;
		      String str2;
		      String[] strdigits;
		      int[]digits=null;
		      while (sc.hasNextLine()){  
		          str=sc.nextLine();
		          int x=convertChoice2Int(str);
		          switch(x){
		          case(0):
		          {
		        	  int n=Integer.parseInt(sc.nextLine());
		        	  fib(n);
		        	  break;
		          }
		          case(1):
		          {
		        	  String Line=sc.nextLine();
		        	  strdigits=Line.split(" ");
		        	  digits=converttoIntDigits(strdigits);
		        	  Arrays.sort(digits);
		        	  System.out.println(Arrays.toString(digits));
		        	  break;
		          }
		          case(2):
		          {
		          Arrays.sort(digits);
		          int digit=Integer.parseInt(sc.nextLine());
		          int pos=Arrays.binarySearch(digits, digit);
		          if(pos<0)
		        	  System.out.println(-1);
		          else
		        	  System.out.println(pos);
		          break;
		          }
		          case(3):
		          {
		           int a=Integer.parseInt(sc.nextLine());
		           for(int i=0;i<a;i++)
		           {
		        	   String id=sc.nextLine();
		        	   getBirthDate(id);
		           }
		          break;
		          }
		         default:
		        	 System.out.println("exit");
		        	 return;
		          }
		      }
		    }
	private static void getBirthDate(String id) {
		// TODO Auto-generated method stub
		String str1=id.substring(6,10)+"-"+id.substring(10,12)+"-"+id.substring(12,14);
		System.out.println(str1);
	}

	private static int[] converttoIntDigits(String[]strDigits) {
		// TODO Auto-generated method stub
		int []digits=new int[strDigits.length];
		for(int i=0;i<strDigits.length;i++)
		{
			digits[i]=Integer.parseInt(strDigits[i]);
		}
		return digits;
	}

	private static void fib(int n) {
		int a=1,b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.print('\r');
	}

	private static int convertChoice2Int(String str) {
		int j;
		if(str.equals("fib"))
		    j=0;
		else if(str.equals("sort"))
			j=1;
		else if(str.equals("search"))
			j=2;
		else if(str.equals("getBirthDate"))
			j=3;
		else 
			j=4;
		return j;
	}

		

	}


