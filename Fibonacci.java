import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int c  ;
            System.out.print(a +" "+ b);
        for(int i = 1;i<=number;i++ ){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" " +c + " ");

        }


        
    }
}