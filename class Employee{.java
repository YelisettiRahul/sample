 class Student{
    int sid;
    String sname;
    Student(int x,String y) {
        sid=x;
        sname=y;

    }
}
class Assessment{
public static void main(String[] args) {
    Student s1=new Student (123,"RAHUL");
    Student s2=new Student (143,"NAIDU");
    System.out.println(s1.equals(s2));
    System.out.println(s1==s2);
    System.out.println(s1.hashCode());
    System.out.println(s1.toString());
    System.out.println(s2.getClass());
    
    
} 
}