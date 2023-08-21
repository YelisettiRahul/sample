import java.util.*;
class Operators {
	public static void main(String[] args) 
	{
		int a,b,c;
		boolean d;
		System.out.println("enter a,b value");
 Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a*b;//arithematic operator
System.out.println("c="+c);
d=(c==2*a)?true:(c==2*b)?true:false;
//assignment,terinary,relational operators
System.out.println(d);
c=(d==false)?c++:c--;
//unary operator
System.out.println(c);
d=(c>a)&&(c>b);
//logical operator
System.out.println(d);

	}
}