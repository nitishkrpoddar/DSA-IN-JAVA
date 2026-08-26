import java.util.Scanner;

public class reverseVowelInString {
    public  void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
                if (!isVowel(arr[i])) i++;
                if (!isVowel(arr[j])) j--;
                if (isVowel(arr[i]) && isVowel(arr[j])) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        String s1= new String(arr);
         System.out.print(s1);
            }
            boolean isVowel(char ch){
               if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ) {
                   return true;
                }
                else{
                    return false;
                }

            }

}

