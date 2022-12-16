import java.util.Scanner;

public class _47_Array_Problem {
//    Count The Number Of Triplets whose Sum is Equal To given Values
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
        findingFirstNumber:for(int i=0; i<arr.length; i++){
            findingSecondNumber:for(int j=i+1;j<arr.length; j++){
                findingThirdNumber:for(int k=j+1;k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println("("+arr[i] +","+ arr[j]+","+arr[k]+")");
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
