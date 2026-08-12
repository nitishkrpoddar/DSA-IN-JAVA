import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size of Array=");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("");
        for(int i=-0;i<arr.length;i++){
            System.out.print("Enter your "+(i+1)+" element=");
            arr[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.print("Array without reverse=");
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]+",");
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("");
        System.out.print("Reverse Array        =");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }
}
