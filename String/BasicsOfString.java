import java.util.*;
public class BasicsOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=new String("abcd");
        System.out.println(s1);

        //Makeing String using Char Array.
        char chrs[]={'a','v','c'};
        String s2=new String(chrs);
        System.out.println(s2);

        //Making Char Array to String.
        char [] arr=s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        //Print String Element line By Line.
        //TO Print String Size
        System.out.print(arr.length); // Array Has Varible size we do not use ().
        System.out.print(s2.length());// In String it is a method.

        //To take any char from string
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            System.out.print(ch);
        }
        //In C Programming Char size=1bit=8byte .Therefore Max Possible combination can Char can store =2^8=256 .It can't store all char
        //  in the world .Therefore in Java Programming size of char =2bit.

        // In java == for String checks whether both variable refer to the same object,not wether theri text is equal.
        //Because java keeps sting literals like "abcd" in a special area called the string pool(inside heap).
        //String pool indeicate the same address value with different name .Therefore s1=s2 mean address value of both string is samne
        //not a char .
        //But wehn we use new in String mean String s1=new Strint("abcd")-it mean if creatr new object in heap .

        //What is Heap?
        //The Heap is the main memory area where java object are created.



    }
}
