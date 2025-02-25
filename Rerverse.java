import java.util.Scanner;

public class Rerverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int rem = 0;
        int rever = 0;


        while (number>0) {
            rem = number%10;
            rever = rever*10+rem;
            number = number/10;
        }
        System.out.println(rever);
        
    }
}
