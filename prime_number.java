import java.util.*;

public class prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number .........");
        int number = sc.nextInt();
        int flag = 0;
        
        if(number == 1 || number ==0){
            System.out.print("not a prime number ...........");
        }else if(number %2 ==0){
            System.out.println("not a prime number........");
            flag = 1;
          

        }else if(flag == 0){
            System.out.println("it is the prime number.........");

        }

        
    }

}