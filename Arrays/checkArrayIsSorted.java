import java.util.Scanner;

public class checkArrayIsSorted {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        boolean b=true;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        while(j<arr.length-1){
           if(arr[j]==arr[j+1]){
                b=true;
               }
              else if(arr[j]>arr[j+1]){
                b=false;
                break;
            }
            j++;
        }
        if(b!=true)System.out.print("Array is Not Sorted");
        else{
            System.out.print("Array is Sorted");
        }
    }
}
