import java.util.Scanner;

public class find_number_array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.err.print("enter the size of the ..........");
        int size = sc.nextInt();
        System.out.println("enter the element of the array..........");
        int array[] = new int[size];
        for(int i =0;i<size;i++){
            array[i] = sc.nextInt();
        }
        for(int j = 0;j<size;j++){
            System.err.print(array[j]+ " ");
        }
        System.out.println("enter the find of the number............");
        int x  = sc.nextInt();
        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("your number is find...... "+x);
                System.out.println("index number is........ "+i);
            }


        }
    }

    
}
