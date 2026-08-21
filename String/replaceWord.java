import java.util.Scanner;

public class replaceWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your sentence= ");
        String s=sc.nextLine();
        System.out.print("Enter your replace word from sentence= ");
        String replace=sc.nextLine();
        System.out.print("Enter your replacement word ");
        String replacement=sc.nextLine();
        System.out.print("Your new sentence= ");
        String s1=s.replace(replace,replacement);
        System.out.print(s1);
    }
}
