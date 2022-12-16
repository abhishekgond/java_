import java.util.Scanner;

public class _46_ArrayProblem {
//Find The Total Number In The Array Whose Sum Is equal To The Given Values
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Array Size : ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        // Taking Input From The user
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum of Whose Value : ");
        int target = sc.nextInt();
        int sum =0;
        for(int i=0; i<arr.length; i++){
            for(int j=1;j<arr.length-1; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("("+arr[i] +","+ arr[j]+")");
                    sum++;
                }
            }
        }
        System.out.println(sum);


    }
}
