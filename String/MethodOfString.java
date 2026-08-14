import java.util.*;
public class MethodOfString {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);

       // 1. Basic String Methods

       // Method	  What it does	                Example	         Result
       // length()	  Returns number of characters	s.length()	     11
      //  charAt(i)	  Gets character at index	    s.charAt(1)	     'e'
      //  isEmpty()	  Checks if length is 0      	s.isEmpty()	     false
      //  isBlank()	  Checks empty/only spaces 	    s.isBlank()	     false


        String s1="abcd";
        String s2="ABCD";
        //To cheak two String containt equal or not.
        System.out.println(s1.equals(s2));

        //TO cheak  Two String ignoreing Case;
        String s5="abcd";
        String s6="ABCD";
        System.out.println(s5.equalsIgnoreCase(s6));

        //To check wether A String is start with or end with that word.
        System.out.println(s5.startsWith(s6));
        System.out.println(s5.endsWith(s6));

        //TO check that wether String contains that word or not .
        System.out.println(s5.contains(s6));

        //TO remove space from String from Starting and endinfd
        System.out.println(s5.trim());

        //TO replace a letter from another in String
        String s7=s5.replace('a','z');
        //for frist letter
        String s11= s5.replaceFirst("abc","z");
        System.out.println(s11);

        //Take part of String
        String s14="Abcded";
        System.out.println(s14.substring(2,5));

        //Sub sequence mean =continous path of String but we can drop any letter between frist letter and last
        // ac,ab,ad,af,ae=Sub Sequence.
        // ca,ea=not equal to Sub Sequence.

       // 1. length()
        //2. charAt()
        //3. equals()
        //4. equalsIgnoreCase()
        //5. indexOf()
        //6. lastIndexOf()
        //7. contains()
        //8. substring()
        //9. toUpperCase()
        //10. toLowerCase()
        //11. trim()
        //12. replace()
        //13. split()
        //14. toCharArray()
        //15. String.valueOf()
        //16. startsWith()
        //17. endsWith()
        //18. isEmpty()
        //19. isBlank()
        //20. compareTo()

       //  Converting Other Data Types to String
      //  String.valueOf()
          int n = 123;
         String ad = String.valueOf(n);
         System.out.println(ad);
         //  Now as is:
        //  "123"


                // =========================================================
                // 1. length()
                // =========================================================
                // Input:  "Hello"
                // Output: 5

                String sa = "Hello";
                System.out.println(sa.length());


                // =========================================================
                // 2. charAt()
                // =========================================================
                // Input:  "Hello", index = 1
                // Output: e

                String sb= "Hello";
                System.out.println(sb.charAt(1));


                // =========================================================
                // 3. equals()
                // =========================================================
                // Input:  "Hello", "Hello"
                // Output: true

                String sca= "Hello";
                System.out.println(sc.equals("Hello"));


                // =========================================================
                // 4. equalsIgnoreCase()
                // =========================================================
                // Input:  "Hello", "hello"
                // Output: true

                String sd = "Hello";
                System.out.println(sd.equalsIgnoreCase("hello"));


                // =========================================================
                // 5. indexOf()
                // =========================================================
                // Input:  "banana", character = 'a'
                // Output: 1

                String se = "banana";
                System.out.println(se.indexOf('a'));


                // =========================================================
                // 6. lastIndexOf()
                // =========================================================
                // Input:  "banana", character = 'a'
                // Output: 5

                String sf = "banana";
                System.out.println(sf.lastIndexOf('a'));


                // =========================================================
                // 7. contains()
                // =========================================================
                // Input:  "Hello World", "World"
                // Output: true

                String sg = "Hello World";
                System.out.println(sg.contains("World"));


                // =========================================================
                // 8. substring(start)
                // =========================================================
                // Input:  "Hello", start = 2
                // Output: llo

                String s8 = "Hello";
                System.out.println(s8.substring(2));


                // =========================================================
                // 9. substring(start, end)
                // =========================================================
                // Input:  "Hello", start = 1, end = 4
                // Output: ell
                //
                // NOTE: End index is excluded.

                String s9 = "Hello";
                System.out.println(s9.substring(1, 4));


                // =========================================================
                // 10. toUpperCase()
                // =========================================================
                // Input:  "hello"
                // Output: HELLO

                String s10 = "hello";
                System.out.println(s10.toUpperCase());


                // =========================================================
                // 11. toLowerCase()
                // =========================================================
                // Input:  "HELLO"
                // Output: hello

                String s111= "HELLO";
                System.out.println(s111.toLowerCase());


                // =========================================================
                // 12. trim()
                // =========================================================
                // Input:  "   Hello   "
                // Output: "Hello"

                String s12 = "   Hello   ";
                System.out.println(s12.trim());


                // =========================================================
                // 13. strip()
                // =========================================================
                // Input:  "   Hello   "
                // Output: "Hello"

                String s13 = "   Hello   ";
                System.out.println(s13.strip());


                // =========================================================
                // 14. replace()
                // =========================================================
                // Input:  "banana", replace 'a' with 'x'
                // Output: bxnxnx

                String s141 = "banana";
                System.out.println(s141.replace('a', 'x'));


                // =========================================================
                // 15. replaceFirst()
                // =========================================================
                // Input:  "banana", replace first "a" with "x"
                // Output: bxnana

                String s15 = "banana";
                System.out.println(s15.replaceFirst("a", "x"));


                // =========================================================
                // 16. replaceAll()
                // =========================================================
                // Input:  "a1b2c3", remove all digits
                // Output: abc

                String s16 = "a1b2c3";
                System.out.println(s16.replaceAll("[0-9]", ""));


                // =========================================================
                // 17. split()
                // =========================================================
                // Input:  "Apple,Banana,Mango"
                // Output:
                // Apple
                // Banana
                // Mango

                String s17 = "Apple,Banana,Mango";
                String[] fruits = s17.split(",");

                for (String fruit : fruits) {
                    System.out.println(fruit);
                }


                // =========================================================
                // 18. toCharArray()
                // =========================================================
                // Input:  "Hello"
                // Output: H e l l o

                String s18 = "Hello";
                char[] chars = s18.toCharArray();

                for (char c : chars) {
                    System.out.print(c + " ");
                }
                System.out.println();


                // =========================================================
                // 19. startsWith()
                // =========================================================
                // Input:  "Hello World", "Hello"
                // Output: true

                String s19 = "Hello World";
                System.out.println(s19.startsWith("Hello"));


                // =========================================================
                // 20. endsWith()
                // =========================================================
                // Input:  "Hello World", "World"
                // Output: true

                String s20 = "Hello World";
                System.out.println(s20.endsWith("World"));


                // =========================================================
                // 21. isEmpty()
                // =========================================================
                // Input:  ""
                // Output: true

                String s21 = "";
                System.out.println(s21.isEmpty());


                // =========================================================
                // 22. isBlank()
                // =========================================================
                // Input:  "   "
                // Output: true

                String s22 = "   ";
                System.out.println(s22.isBlank());


                // =========================================================
                // 23. concat()
                // =========================================================
                // Input:  "Hello ", "Java"
                // Output: Hello Java

                String s23 = "Hello ";
                System.out.println(s23.concat("Java"));


                // =========================================================
                // 24. compareTo()
                // =========================================================
                // Input:  "abc", "abc"
                // Output: 0
                //
                // 0       -> Strings are equal
                // Negative -> First String comes before second
                // Positive -> First String comes after second

                String s24 = "abc";
                System.out.println(s24.compareTo("abc"));


                // =========================================================
                // 25. compareToIgnoreCase()
                // =========================================================
                // Input:  "ABC", "abc"
                // Output: 0

                String s25 = "ABC";
                System.out.println(s25.compareToIgnoreCase("abc"));


                // =========================================================
                // 26. String.valueOf()
                // =========================================================
                // Input:  123
                // Output: "123"

                int number = 123;
                String s26 = String.valueOf(number);
                System.out.println(s26);


                // =========================================================
                // 27. String.join()
                // =========================================================
                // Input:  "10", "20", "30" with "-"
                // Output: 10-20-30

                String result = String.join("-", "10", "20", "30");
                System.out.println(result);


                // =========================================================
                // 28. repeat()
                // =========================================================
                // Input:  "Hi", repeat = 3
                // Output: HiHiHi

                String s28 = "Hi";
                System.out.println(s28.repeat(3));

    }
}
