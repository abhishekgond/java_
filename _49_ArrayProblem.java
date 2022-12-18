import java.util.Scanner;

//Write A Java Program to Find number which Is Not repeated In the array (Where only positive values allowed)
class Array_Print{
    void  CreatingArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    void printingArray(int arr[]){
        for (int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] =-1;
                    arr[j] =-1;
                }
            }
        }
        for(int i=0;i<arr.length; i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class _49_ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arrays length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Array_Print ab = new Array_Print();
        ab.CreatingArray(arr);
        ab.printingArray(arr);


    }
}
