import java.util.Scanner;
public class firstUniqueCharacterInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your word=");
        String s=sc.nextLine();
        boolean flage =false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.print("Unique character is="+ch);
                flage=true;
                break;
            }

        }
        if(!flage){
            System.out.print("NO Unique character");
        }
    }
}
