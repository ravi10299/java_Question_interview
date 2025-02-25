public class SwapNumber {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("without swaping");
        System.out.println("a"+" = " + a + " b" + " = "+ b);
        a  = a+b;
        b = a-b;
        a = a-b;
        System.out.println("swaping the number");
        System.out.println("a"+" = " + a + " b" + " = "+ b);

        
    }
}
