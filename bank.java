class Bank {
    public static void main(String[]args)
    {
        int B=25000, D=15000, T=11000,current,interest;
        current=(B+D)-T;
        System.out.println("current "+current);
        interest=(current*2/100)*12;
        System.out.println("interest "+interest);
        current=current+interest;
        System.out.println("current "+current);


    }
    
}
