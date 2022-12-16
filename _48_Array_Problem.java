import java.util.Scanner;

public class _48_Array_Problem {
//    Find The Unique number in the Given Array Where All The Element are being repeated twice With one value bing unique

    static int UniqueValue(int [] arr){
        for(int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans =0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Array Size : ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        // Taking Input From The user
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(" Unique Value is :  "+UniqueValue(arr));

    }
}
