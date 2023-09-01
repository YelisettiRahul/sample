import java.util.Scanner;
class Student {
    int sid;
    String sname;
    int marks;
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        sid = sc.nextInt();
        System.out.println("Enter Student name: ");
        sname =sc.next();
        System.out.println("Enter marks: ");
        marks = sc.nextInt();

    }
    public void output() {
        System.out.println(sid+" "+sname+" "+marks);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input();
        s1.output();
    }
}