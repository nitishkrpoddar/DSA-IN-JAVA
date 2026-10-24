import java.util.Scanner;

public class prime_Number {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter you Number= ");
        int n=sc.nextInt();
        if(n<=1) System.out.print("Not a Prime Number");
        boolean b=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        if(b) {
            System.out.print("Number is prime Number");
        }

        else {
            System.out.print("Number is Not a prime Number");
        }
    }
}
