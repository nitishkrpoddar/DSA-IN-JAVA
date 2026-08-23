import java.util.*;

public class subString {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String s1=s.substring(start, end);
        System.out.print(s1);
    }
}
