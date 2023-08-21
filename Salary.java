import java.util.*;
class Salary {
    public static void main(String[]args)
    {
    double da,hra,pf,gr;
    int s;
    System.out.println("enter salary");
    Scanner sc=new Scanner(System.in);
    s= sc.nextInt();
    da=s*0.12;
    System.out.println("da "+da);
    hra=s*0.13;
    System.out.println("hra "+hra);
    pf=s*0.15;
    System.out.println("pf "+pf);
    gr=s+pf+hra;
    System.out.println("gr "+gr);
    }
    
}
