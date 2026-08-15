import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type your sentence=");
        String s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.print("Your reverse String = ");
        System.out.println(s2);
    }
}
