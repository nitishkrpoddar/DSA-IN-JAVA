import java.util.Scanner;

public class checkIfTwoArrayStringAreEquilavent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number of word in 1st String=");
        int n=sc.nextInt();
        System.out.print("Enter your number of word in 2nd String=");
        int n1=sc.nextInt();

        String[] word1 = new String[n];
        String[] word2 = new String[n1];
        System.out.println("Enter your word in frist String:");
        for(int i=0;i<word1.length;i++){
            word1[i]=sc.next();
        }
        System.out.println("Enter your word in second String:");
        for(int j=0;j<word2.length;j++){
            word2[j]=sc.next();
        }

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String s : word1) {
            str1.append(s);
        }

        for (String s : word2) {
            str2.append(s);
        }

        if (str1.toString().equals(str2.toString())) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}