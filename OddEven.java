import java.util.Scanner;

public class OddEven{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("the number is even : " +number);
        }else{
            System.out.println("the number is odd : " + number);
        }
    }
}