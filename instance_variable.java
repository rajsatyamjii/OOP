import java.util.Scanner;
public class instance_variable {
    static String name="AIR 1";
    String name2="RAJA JII";
    public static void main(String[] args) {
   instance_variable ob1=new instance_variable();
        System.out.println("Before Change ");
        System.out.println(ob1.name2);
        System.out.println(name);
        System.out.println("After Change");
        ob1.name2="Satyam";//without static instance variable
        System.out.println(ob1.name2);
        ob1.name="King";//with static instance variable
        System.out.println(ob1.name);



        System.out.println("----------------------");
        instance_variable ob2=new instance_variable();
        System.out.println(ob2.name);//with static instance variable
        System.out.println(ob2.name2);//without static instance variable



    }
}
