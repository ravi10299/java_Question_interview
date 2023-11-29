import java.util.Scanner;

public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number...............");
            int number =  sc.nextInt();
            int rem = 0;
            System.out.println(number);
            do{
                
                rem  = number%10;
                number = number/10;
                System.out.println(rem);
            }while(number>=1);



        
    }
}
