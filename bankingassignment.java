class Bank{
    int currentBalance= 10000;
   public static void greetCustomer(){
        System.out.println("Hello to the banking");
    }
    public void deposit(int amount){
        currentBalance = currentBalance + amount;

    }
    public void withdrawl(int amount){
        currentBalance= currentBalance-amount;

    }
    public static void main(String[] args) {
        greetCustomer();
        Bank obj1= new Bank();
        obj1.deposit(200);
        Bank obj2= new Bank();
        obj2.withdrawl(100);
        
    }
}