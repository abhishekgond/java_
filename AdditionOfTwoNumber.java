import java.util.Scanner;

public class AdditionOfTwoNumber {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter Your First Number : =  ");
        int a = Sc.nextInt();
        System.out.print("Enter Your Second Number : =  ");
        int b = Sc.nextInt();
        int sum = a+b;
        System.out.println("Total : "+ sum);
    }
}
