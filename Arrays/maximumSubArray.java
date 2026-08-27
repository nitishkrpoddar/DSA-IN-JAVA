import java.util.Scanner;

public class maximumSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number of element=");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter your element:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
    }
        int max =Integer.MIN_VALUE;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.print("your Max sum="+max);
    }
}
