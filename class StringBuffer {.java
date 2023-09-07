class stringBuffer {
    public static void main(String[] args) {
    
        StringBuilder sb1=new StringBuilder ("Rahul");
        StringBuilder sb2=new StringBuilder("Chotu");
        System.out.println(sb2.reverse());
        System.out.println(sb2.delete(0,1));
        System.out.println(sb1.append("Naidu"));
        System.out.println(sb1.insert(0,5));
        System.out.println(sb2.length());
        StringBuffer sb3=new StringBuffer ("Rahul");
        StringBuffer sb4=new StringBuffer("Chotu");
        System.out.println(sb2.reverse());
        System.out.println(sb2.delete(0,1));
        System.out.println(sb1.append("Naidu"));
        System.out.println(sb1.insert(0,5));
        System.out.println(sb2.length());
    }
    
}
