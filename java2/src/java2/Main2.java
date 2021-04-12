package java2;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		 {
	     int n,x,y;
		 n=sc.nextInt();
		 x=sc.nextInt();
		 y=sc.nextInt();
		 String a;
		 String str1=String.valueOf(n);
		 StringBuilder stringBuilder = new StringBuilder();
		 for(int i=0;i<n;i++)
		 {
			 stringBuilder.append(i);
		 }
	    a=stringBuilder.substring(x,y);
	    System.out.println(a);
}
}
}