import java.util.Scanner;

public class bubble_sort {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        for(int i=1;i<n-1-i;i++){
            int swap=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;
        }
        print(arr);
    }
    public static void print(int arr []){
        for(int els:arr)System.out.print(els);
        System.out.println("");
    }
}
