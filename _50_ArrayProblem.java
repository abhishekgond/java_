import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//Finding Second Maximum Values in The array
class Ar {
    Scanner sc = new Scanner(System.in);
 // Taking input ...
    void takingInput(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
 // printing output ...
    static void printing(int arr[]) {
        System.out.print("Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
//    first largest Number ...
    void  FindingGraterNumber(int arr[]){
//        throw Arrays property
        System.out.println(" ");
        System.out.print("Shorted Array : ");
        Arrays.sort(arr);
        int i;
        for( i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        System.out.println("First Biggest Number in the Array : " + " "+ arr[arr.length-1]);
        System.out.println("Second Biggest Number in the Array : " + " "+ arr[arr.length-2]);
        System.out.println("First Smallest Number is :  "+" " + arr[0]);
        System.out.println("Second Smallest Number is :  "+" " + arr[1]);
    }
    static int  FirstMaxNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
    static  int SecondMax(int [] arr){
        int mx = FirstMaxNumber(arr);
        for(int i=0;i<arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second = FirstMaxNumber(arr);
        return second;
    }
}


public class _50_ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of Arrays : ");
       int a =  sc.nextInt();
        int arr[] = new int [a];
       Ar array = new Ar();
        array.takingInput(arr);
        array.printing(arr);
//        array.FindingGraterNumber(arr);
        System.out.println("First :"+ array.FirstMaxNumber(arr));
        System.out.println("Second : "+  array.SecondMax(arr));


    }


}
