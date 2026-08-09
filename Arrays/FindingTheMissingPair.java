import java.util.Arrays;
import java.util.Scanner;
public class FindingTheMissingPair{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of Element=");
       int n=sc.nextInt();
       int nums []=new int [n];
       for(int a=0;a<nums.length;a++){
           nums[a]=sc.nextInt();
       }
       Arrays.sort(nums);
        int j=nums.length-1;
        int k=0;
        if(nums.length<2){
          System.out.println("Missing pair="+nums[0]);
        }
        else{
            for(int i=0;i<j;i+=2){
                if(nums[i]!=nums[i+1]){
                    System.out.println("Missing pair="+nums[i]);
                    break;
                }
            }
        }
        System.out.println("Missing pair="+nums[j]);
    }
}
