import java.util.Scanner;
public class moveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number of element= ");
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int l=0;
        int r=0;
        while (l<array.length){
            if(array[l]!=0){
                int temp=array[l];
                array[l]=array[r];
                array[r]=temp;
                r++;
            }
            l++;
        }

        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+",");
        }

    }
}
