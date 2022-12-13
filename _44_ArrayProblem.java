import java.util.Scanner;

public class _44_ArrayProblem {

//    Creating Array
    //    __________________________________________________________________________________________

    static void CreatingArrays(int arr[]){

    CreatingArrays :for(int i=0;i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] =sc.nextInt();
        }
    }
 // Printing Array
    //    __________________________________________________________________________________________

    static void printingArrays(int arr[]){
    PrintingArray :for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //    __________________________________________________________________________________________
//    Count The Number of occurrences of a particular Element
    static void RepeatedArrays(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Which Value You are Find : ");
        int val = sc.nextInt();
        int count =0;
    RepeatedArray :for(int i=0;i<arr.length; i++){
            if(val==arr[i]){
                count++;
            }
        }
        System.out.println(val +" Is Finding in Array " + count + " Times ");
    }
    //    __________________________________________________________________________________________

    //    Find The last occurrences of last index
    static void LastIndexArrays(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Which Value You are Find At Last Index : ");
         int val = sc.nextInt();
         int LastIndex = -1;
        LastIndexArray :for(int i=0;i<arr.length; i++){
            if(arr[i] == val){
               LastIndex = i;
            }
        }
        System.out.println("Last Index of "+ val + " IS " +LastIndex);
    }
    //    __________________________________________________________________________________________
//    Count The Number Of Element strictly Grater Then The values of x
    static void GreatestArrays(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value  : ");
        int val = sc.nextInt();
        int Count = 0;
        LastIndexArray :for(int i=0;i<arr.length; i++){
            if(arr[i] > val){
                Count ++;
            }
        }
        System.out.println(Count);
    }

    //    __________________________________________________________________________________________
//          Check if The Given Array is Shorted or Not

    static boolean ShortedArrays(int arr[]){
        LastIndexArray :for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){
                return true;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Array length : ");
        int a =sc.nextInt();
        int arr[]= new int[a];
        CreatingArrays(arr);
//        printingArrays(arr);
        RepeatedArrays(arr);
        LastIndexArrays(arr);
        GreatestArrays(arr);
        ShortedArrays(arr);
    }
}
