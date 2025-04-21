public class Methods {
    public static void main(String[] args) {
        hero();
       int hs=king();
        System.out.println(hs);
        dis("Raj",21);
        int sum=sum(23,43);
        System.out.println("The Sum of Two Number is "+sum);
    }
    //no rteurn no para
    public static void hero(){
        System.out.println("King is here");
    }
    //no return with para
    public static int king(){
        return 6;
    }
   //with para no return
    public static void dis(String Name,int age){
        System.out.println("My name is "+Name+" and my age is "+age);
    }
    //no return no parameter
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
