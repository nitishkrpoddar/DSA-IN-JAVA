import java.util.Scanner;

public class firstAndLastOccrence {
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
        int idx=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if( arr[mid]==target){
                idx=mid;
                j=mid-1;
            }
            else if(arr[mid]>target)j=mid-1;
            else if(arr[mid]<target)i=mid+1;
        }
        int k=0;
        int l=n-1;
        int idxl=0;
        while(k<=l){
            int mid=k+(l-k)/2;
            if( arr[mid]==target){
                idxl=mid;
                k=mid+1;
            }
            else if(arr[mid]>target)l=mid-1;
            else if(arr[mid]<target)k=mid+1;
        }
        System.out.println(idx);
        System.out.print(idxl);
    }
}

