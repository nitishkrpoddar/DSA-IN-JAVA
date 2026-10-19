import java.util.Scanner;

public class insertionSort {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int els:arr){
            System.out.print(els);
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int tem=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                }
            }
        }
        for(int els:arr){
            System.out.print(els);
        }
    }
}
