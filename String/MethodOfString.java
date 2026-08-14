import java.util.*;
public class MethodOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Basic String Methods

        // Method	  What it does	                Example	         Result
        // length()	  Returns number of characters	s.length()	     11
        //  charAt(i)	  Gets character at index	    s.charAt(1)	     'e'
        //  isEmpty()	  Checks if length is 0      	s.isEmpty()	     false
        //  isBlank()	  Checks empty/only spaces 	    s.isBlank()	     false


        String s1 = "abcd";
        String s2 = "ABCD";
        //To cheak two String containt equal or not.
        System.out.println(s1.equals(s2));

        //TO cheak  Two String ignoreing Case;
        String s5 = "abcd";
        String s6 = "ABCD";
        System.out.println(s5.equalsIgnoreCase(s6));

        //To check wether A String is start with or end with that word.
        System.out.println(s5.startsWith(s6));
        System.out.println(s5.endsWith(s6));

        //TO check that wether String contains that word or not .
        System.out.println(s5.contains(s6));

        //TO remove space from String from Starting and endinfd
        System.out.println(s5.trim());

        //TO replace a letter from another in String
        String s7 = s5.replace('a', 'z');
        //for frist letter
        String s11 = s5.replaceFirst("abc", "z");
        System.out.println(s11);

        //Take part of String
        String s14 = "Abcded";
        System.out.println(s14.substring(2, 5));

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



                // 1. length()
                // USE:
                // Returns the total number of characters in a String.
                // SYNTAX:
                // s.length();
                // INPUT:
                // "Hello"
                // OUTPUT:
                // 5

                String sa= "Hello";
                System.out.println(sa.length());


                // ========================================================
                // 2. charAt()
                // =========================================================
                // USE:
                // Returns the character at a specific index.
                //
                // SYNTAX:
                // s.charAt(index);
                //
                // INPUT:
                // "Hello", index = 1
                //
                // OUTPUT:
                // e

                String sb = "Hello";
                System.out.println(sb.charAt(1));


                // =========================================================
                // 3. equals()
                // =========================================================
                // USE:
                // Compares two Strings based on their content.
                //
                // SYNTAX:
                // s1.equals(s2);
                //
                // INPUT:
                // "Hello", "Hello"
                //
                // OUTPUT:
                // true

                String sca = "Hello";
                System.out.println(sca.equals("Hello"));


                // =========================================================
                // 4. equalsIgnoreCase()
                // =========================================================
                // USE:
                // Compares two Strings without considering uppercase
                // and lowercase differences.
                //
                // SYNTAX:
                // s1.equalsIgnoreCase(s2);
                //
                // INPUT:
                // "Hello", "hello"
                //
                // OUTPUT:
                // true

                String s4 = "Hello";
                System.out.println(s4.equalsIgnoreCase("hello"));


                // =========================================================
                // 5. indexOf()
                // =========================================================
                // USE:
                // Finds the first occurrence of a character or String.
                // Returns -1 if it is not found.
                //
                // SYNTAX:
                // s.indexOf(character);
                //
                // INPUT:
                // "banana", 'a'
                //
                // OUTPUT:
                // 1

                String sd = "banana";
                System.out.println(sd.indexOf('a'));


                // =========================================================
                // 6. lastIndexOf()
                // =========================================================
                // USE:
                // Finds the last occurrence of a character or String.
                //
                // SYNTAX:
                // s.lastIndexOf(character);
                //
                // INPUT:
                // "banana", 'a'
                //
                // OUTPUT:
                // 5

                String se = "banana";
                System.out.println(se.lastIndexOf('a'));


                // =========================================================
                // 7. contains()
                // =========================================================
                // USE:
                // Checks whether a String contains another String.
                // Returns true or false.
                //
                // SYNTAX:
                // s.contains("text");
                //
                // INPUT:
                // "Hello World", "World"
                //
                // OUTPUT:
                // true

                String sf = "Hello World";
                System.out.println(sf.contains("World"));


                // =========================================================
                // 8. substring(start)
                // =========================================================
                // USE:
                // Extracts a part of a String from the given index
                // to the end of the String.
                //
                // SYNTAX:
                // s.substring(start);
                //
                // INPUT:
                // "Hello", start = 2
                //
                // OUTPUT:
                // llo

                String s8 = "Hello";
                System.out.println(s8.substring(2));


                // =========================================================
                // 9. substring(start, end)
                // =========================================================
                // USE:
                // Extracts characters between start and end indexes.
                //
                // IMPORTANT:
                // The end index is NOT included.
                //
                // SYNTAX:
                // s.substring(start, end);
                //
                // INPUT:
                // "Hello", start = 1, end = 4
                //
                // OUTPUT:
                // ell

                String s9 = "Hello";
                System.out.println(s9.substring(1, 4));


                // =========================================================
                // 10. toUpperCase()
                // =========================================================
                // USE:
                // Converts all letters of a String to uppercase.
                //
                // SYNTAX:
                // s.toUpperCase();
                //
                // INPUT:
                // "hello"
                //
                // OUTPUT:
                // HELLO

                String s10 = "hello";
                System.out.println(s10.toUpperCase());


                // =========================================================
                // 11. toLowerCase()
                // =========================================================
                // USE:
                // Converts all letters of a String to lowercase.
                //
                // SYNTAX:
                // s.toLowerCase();
                //
                // INPUT:
                // "HELLO"
                //
                // OUTPUT:
                // hello

                String sg = "HELLO";
                System.out.println(sg.toLowerCase());


                // =========================================================
                // 12. trim()
                // =========================================================
                // USE:
                // Removes spaces from the beginning and end of a String.
                //
                // SYNTAX:
                // s.trim();
                //
                // INPUT:
                // "   Hello   "
                //
                // OUTPUT:
                // Hello

                String s12 = "   Hello   ";
                System.out.println(s12.trim());


                // =========================================================
                // 13. strip()
                // =========================================================
                // USE:
                // Removes whitespace from the beginning and end.
                // It handles Unicode whitespace better than trim().
                //
                // SYNTAX:
                // s.strip();
                //
                // INPUT:
                // "   Hello   "
                //
                // OUTPUT:
                // Hello

                String s13 = "   Hello   ";
                System.out.println(s13.strip());


                // =========================================================
                // 14. replace()
                // =========================================================
                // USE:
                // Replaces all occurrences of a character or String.
                //
                // SYNTAX:
                // s.replace(old, new);
                //
                // INPUT:
                // "banana", replace 'a' with 'x'
                //
                // OUTPUT:
                // bxnxnx

                String sh = "banana";
                System.out.println(sh.replace('a', 'x'));


                // =========================================================
                // 15. replaceFirst()
                // =========================================================
                // USE:
                // Replaces only the FIRST matching occurrence.
                //
                // SYNTAX:
                // s.replaceFirst(old, new);
                //
                // INPUT:
                // "banana", replace first "a" with "x"
                //
                // OUTPUT:
                // bxnana

                String s15 = "banana";
                System.out.println(s15.replaceFirst("a", "x"));


                // =========================================================
                // 16. replaceAll()
                // =========================================================
                // USE:
                // Replaces all matching parts using Regular Expression.
                //
                // SYNTAX:
                // s.replaceAll(regex, replacement);
                //
                // INPUT:
                // "a1b2c3", remove digits
                //
                // OUTPUT:
                // abc

                String s16 = "a1b2c3";
                System.out.println(s16.replaceAll("[0-9]", ""));


                // =========================================================
                // 17. split()
                // =========================================================
                // USE:
                // Splits a String into multiple parts and returns
                // them as a String array.
                //
                // SYNTAX:
                // String[] arr = s.split("delimiter");
                //
                // INPUT:
                // "Apple,Banana,Mango"
                //
                // OUTPUT:
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
                // USE:
                // Converts a String into a character array (char[]).
                // Very useful for String/DSA problems.
                //
                // SYNTAX:
                // char[] arr = s.toCharArray();
                //
                // INPUT:
                // "Hello"
                //
                // OUTPUT:
                // H e l l o

                String s18 = "Hello";
                char[] chars = s18.toCharArray();

                for (char c : chars) {
                    System.out.print(c + " ");
                }
                System.out.println();


                // =========================================================
                // 19. startsWith()
                // =========================================================
                // USE:
                // Checks whether a String starts with a specific String.
                //
                // SYNTAX:
                // s.startsWith("text");
                //
                // INPUT:
                // "Hello World", "Hello"
                //
                // OUTPUT:
                // true

                String s19 = "Hello World";
                System.out.println(s19.startsWith("Hello"));


                // =========================================================
                // 20. endsWith()
                // =========================================================
                // USE:
                // Checks whether a String ends with a specific String.
                //
                // SYNTAX:
                // s.endsWith("text");
                //
                // INPUT:
                // "Hello World", "World"
                //
                // OUTPUT:
                // true

                String s20 = "Hello World";
                System.out.println(s20.endsWith("World"));


                // =========================================================
                // 21. isEmpty()
                // =========================================================
                // USE:
                // Checks whether the String has zero characters.
                //
                // SYNTAX:
                // s.isEmpty();
                //
                // INPUT:
                // ""
                //
                // OUTPUT:
                // true

                String s21 = "";
                System.out.println(s21.isEmpty());


                // =========================================================
                // 22. isBlank()
                // =========================================================
                // USE:
                // Checks whether a String is empty or contains only
                // whitespace characters.
                //
                // SYNTAX:
                // s.isBlank();
                //
                // INPUT:
                // "   "
                //
                // OUTPUT:
                // true

                String s22 = "   ";
                System.out.println(s22.isBlank());


                // =========================================================
                // 23. concat()
                // =========================================================
                // USE:
                // Joins one String to the end of another String.
                //
                // SYNTAX:
                // s1.concat(s2);
                //
                // INPUT:
                // "Hello ", "Java"
                //
                // OUTPUT:
                // Hello Java

                String s23 = "Hello ";
                System.out.println(s23.concat("Java"));


                // =========================================================
                // 24. compareTo()
                // =========================================================
                // USE:
                // Compares two Strings lexicographically.
                //
                // SYNTAX:
                // s1.compareTo(s2);
                //
                // INPUT:
                // "abc", "abc"
                //
                // OUTPUT:
                // 0
                //
                // 0        -> Strings are equal
                // Negative -> First String comes before second
                // Positive -> First String comes after second

                String s24 = "abc";
                System.out.println(s24.compareTo("abc"));


                // =========================================================
                // 25. compareToIgnoreCase()
                // =========================================================
                // USE:
                // Compares two Strings lexicographically without considering
                // uppercase/lowercase differences.
                //
                // SYNTAX:
                // s1.compareToIgnoreCase(s2);
                //
                // INPUT:
                // "ABC", "abc"
                //
                // OUTPUT:
                // 0

                String s25 = "ABC";
                System.out.println(s25.compareToIgnoreCase("abc"));


                // =========================================================
                // 26. String.valueOf()
                // =========================================================
                // USE:
                // Converts a primitive value or object into a String.
                //
                // SYNTAX:
                // String.valueOf(value);
                //
                // INPUT:
                // 123
                //
                // OUTPUT:
                // "123"

                int number = 123;
                String s26 = String.valueOf(number);
                System.out.println(s26);


                // =========================================================
                // 27. String.join()
                // =========================================================
                // USE:
                // Joins multiple Strings using a delimiter.
                //
                // SYNTAX:
                // String.join(delimiter, values);
                //
                // INPUT:
                // "10", "20", "30", delimiter = "-"
                //
                // OUTPUT:
                // 10-20-30

                String result = String.join("-", "10", "20", "30");
                System.out.println(result);


                // =========================================================
                // 28. repeat()
                // =========================================================
                // USE:
                // Repeats a String a specified number of times.
                //
                // SYNTAX:
                // s.repeat(number);
                //
                // INPUT:
                // "Hi", repeat = 3
                //
                // OUTPUT:
                // HiHiHi

                String s28 = "Hi";
                System.out.println(s28.repeat(3));
            }
}





