import java.util.Scanner;

public class PrimeNumber{


    public static boolean  isPrime(int number){
       
       for(int i = 2;i<=number/2;i++){
        if (number%i==0) {
            return false;
            
            
        }
       }
           return true;
       
    }
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      System.out.println("check the number is prime enter here");
      int number = sc.nextInt();
      if(isPrime(number)){
          System.out.println("The number is prime " + number);


    }else{
        System.out.println("The number is not prime " + number);
    }
    }
}

