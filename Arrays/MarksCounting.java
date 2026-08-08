import java.util.Scanner;

public class MarksCounting {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many number of student =");
        int n=sc.nextInt();
        int max=0;
        int lowest=100;
        long sum=0;

        int [] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int size=a.length;
        for(int j=0;j<a.length;j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        for(int b=0;b<a.length;b++) {
            if (a[b]<lowest) {
                lowest = a[b];
            }
        }
        for (int h = 0; h < a.length; h++) {
            sum+=a[h];
        }
        double avg=(double)sum/size;     //type casting sum =long into double for double value
        // we can also multiply double value in long for make long to double

        System.out.println("Array is=  ");
        for (int k = 0; k < a.length; k++) {
            System.out.print( a[k]+",");
        }
        System.out.println();
        System.out.println("Enter value for search=");
        int value=sc.nextInt();
        int con=0;
        for(int c=0;c<a.length;c++){
            if(value==a[c]){
                con++;
                break;
            }
        }
        if(con>0){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number Not Found");
        }

        System.out.println("max marks is="+max);
        System.out.println("min marks is="+lowest);
        System.out.println("Average is="+avg);

    }
}


