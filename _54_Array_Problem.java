import java.util.Arrays;
import java.util.Scanner;

//Given two Integer a and b. SwapThe 2 Given Values .
class Array{
    void SwappingNumber(int a , int b){
        System.out.println("Before : "+ a );
        System.out.println("Before : "+ b );
        int temp;
        temp =a;
        a = b;
        b= temp;
        System.out.println("After : "+ a );
        System.out.println("After : "+ b );
    }
//    Given two Integer a and b. SwapThe 2 Given Values Using Sum And Different Methode
    void LinePrinting(){
        System.out.println("________________________________________________");
    }
    void DifferanceMethod(int a, int b){
        System.out.println("Before : " + a);
        System.out.println("Before : " + b);
        // a=9, b=4
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("After : " + a);
        System.out.println("After : " + b);

    }
}


public class _54_Array_Problem {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        Array obj = new Array();
        obj.SwappingNumber(a,b);
        obj.LinePrinting();
        obj.DifferanceMethod(a,b);

    }
}
