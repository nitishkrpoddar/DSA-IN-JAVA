import java.util.*;
public class countVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your word= ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                    if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                        v++;
                    }
                   else{
                       c++;
                    }
        }
        System.out.println("Total number of Vowels= "+v);
        System.out.println("Total number of Consonanta= "+c);
    }
}
