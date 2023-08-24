import java.util.Scanner;
class Discounts{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to XYZ Super Market");
        System.out.println("Available products are nuts,oils,soaps,other products");
        System.out.println("Enter choice");
        int bill=20000;
        int choice ;
        choice= sc.nextInt();
        double discount ;
    
    switch(choice) {
        case 1:discount=bill*0.1;
                 break;
        case 2:discount=bill*0.05;
                 break;
        case 3:discount=bill*0.12;
                  break;
        default:discount=bill*0.02;

    }
    System.out.println(discount);


}
    
    }
    

