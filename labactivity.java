import java.util;
class BankCustomer {
    int acno;
    String atype;
    int amt;
    BankCustomer(){
        acno= 2704;
        atype= "axis";
        amt= 25000;
    }
        void show()
        {
            System.out.println(acno+" "+atype+" "+amt);
        }
        BankCustomer(int x,String y,int z){
            acno=x;
            atype=y;
            amt=z;
        }
        public static void main(String[] args) {
            BankCustomer b=new BankCustomer();
            b.show();
            BankCustomer b1=new BankCustomer(19,"hj",7890);
            b1.show();


        }
    }


