import java.util.Scanner;

public class reverseSort {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println("");
        for(int j=1;j<=n-1;j++){
            int swap=0;
            for(int k=n-1;k>0;k--){
                if(arr[k]>arr[k-1]){
                    int temp=arr[k];
                    arr[k]=arr[k-1];
                    arr[k-1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int els:arr){
            System.out.print(els);
        }
    }
}
