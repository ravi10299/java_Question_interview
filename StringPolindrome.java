import java.util.Scanner;

public class StringPolindrome {

    public static boolean CheckString(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<right) {
            if (str.charAt(left)!=str.charAt(right)) {
               return false;
            }
            left++;
            right--;

            
        }return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        System.out.println(CheckString(str));
       
      

    }
}
