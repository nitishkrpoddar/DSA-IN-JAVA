import java.util.Scanner;

public class convertLowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your lowercase String=");
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int n=(int)ch;
            s1+=(char)(n-32);
        }
        System.out.println("Your upperCase String");
        System.out.print(s1);
    }
}
