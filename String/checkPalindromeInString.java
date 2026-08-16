import java.util.*;
public class checkPalindromeInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your word=");
        String s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.print("Your Word is ");
        if(s1.equals(s2)){
            System.out.print("Palindrome String");
        }
        else{
            System.out.print("Not a Palindeome String");
        }

    }
}
