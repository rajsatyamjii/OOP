import java.util.Arrays;

public class Stringg {
    public static void main(String[] args) {
        String s1=new String("raj");
        String s2="Sataym";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+" "+s2);

        String s="Raja Jii";
        System.out.println(s.length());
        char[] arr= s.toCharArray();
        System.out.println("to char array"+ Arrays.toString(arr));
        String rr="Kohli";
        System.out.println("Char at 1 : "+rr.charAt(1));

        String fh="RCB";
        String bf="RCB";
        System.out.println();
        System.out.println(fh.equals(bf));
        System.out.println(fh==bf);
        String s45=new String("King");
        String s65=new String("King");
        System.out.println(s45==s65);//compare memory address
    }
}
