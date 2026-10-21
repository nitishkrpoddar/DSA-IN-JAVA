import java.util.Scanner;

public class MoveAllZerosToEnd {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println("");
        for(int i=0;i<n-1;i++){
            for(int k=0;k<n-1;k++){
                if(arr[k]==0){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        print(arr);
    }
    static void print(int arr[]){
        for(int els:arr){
            System.out.print(els);
        }
    }
}
