import java.util.Scanner;

public class binarySearch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int els:arr){
            System.out.print(els+",");
        }
        System.out.println("");
        int target=sc.nextInt();
        int i=0;
        int j=n-1;
        boolean b=false;
        while(i<=j){
            int mid=i+(j-i)/2;
             if( arr[mid]==target){
                 b=true ;
                 break;
             }
          else if(arr[mid]>target)j=mid-1;
           else if(arr[mid]<target)i=mid+1;
        }
        if(b==true)System.out.print("true");
        else System.out.print("false");
    }
}
