import java.util.Scanner;
public class MoneyCount {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int a=500;
        int b=200;
        int c=100;
        int d=50;
        int e=20;
        int f=10;
        int g=5;
        int h=2;
        int i=1;
        int fiveh=0;
        int twoh=0;
        int hun=0;
        int fifty=0;
        int twenty=0;
        int ten=0;
        int five=0;
        int two=0;
        int one=0;
        int count=-1;

        System.out.println("Enter you Amount=");
        int n=sc.nextInt();
        while(n>0){
            count++;
            if(n>=500){
                fiveh++;
                n=n-500;
                continue;
            }
            else if(n>=200){
                twoh++;
                n=n-200;
                continue;
            }
            else if (n>=100){
                hun++;
                n=n-100;
                continue;
            } else if (n>=50){
                fifty++;
                n=n-50;
                continue;
            } else if (n>=20){
                twenty++;
                n=n-20;
                continue;
            } else if (n>=100){
                ten++;
                n=n-10;
                continue;
            }else if (n>=5){
                five++;
                n=n-5;
                continue;
            } else if (n>=2){
                two++;
                n=n-2;
                continue;
            } else {
                one++;
                n=n-1;
                continue;
            }
        }
        System.out.println("number of 500 note="+fiveh);
        System.out.println("number of 200  note="+twoh);
        System.out.println("number of 100 note="+hun);
        System.out.println("number of 50 note="+fifty);
        System.out.println("number of 20 note="+twenty);
        System.out.println("number of 10 note="+ten);
        System.out.println("number of 5 note="+five);
        System.out.println("number of 2 note="+two);
        System.out.println("number of1  note="+one);
        System.out.println("Total Number of Note="+count);
    }
}
