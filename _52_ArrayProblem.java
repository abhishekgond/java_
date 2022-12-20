import java.util.Scanner;

// Given Two integer  a nad B Swap The 2 Given Values using Temporary Variable


class swap{
    static void swap(){
        int temp;
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter First  number  ");
        int a = Sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b= Sc.nextInt();
        System.out.println("Original Before Swap " + a);
        System.out.println("Original Before Swap " + b);
        temp = a;
        a = b;
        b =temp;
        System.out.println("After swap " +a);
        System.out.println("After swap " +b);

    }

//    other  method For Swap Two Number
    static void sum_diff(){
        int sum = 0;
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter First  number  ");
        int a = Sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b= Sc.nextInt();
        System.out.println("Original Before Swap " + a);
        System.out.println("Original Before Swap " + b);
        a = sum + b;
        b = sum + a;
        System.out.println("After swap " +a);
        System.out.println("After swap " +b);




    }

}
public class _52_ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swap sw = new swap();
//        sw.swap();
        sw.sum_diff();


    }
}
