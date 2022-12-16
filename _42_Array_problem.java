import java.util.Scanner;

public class _42_Array_problem {
    public static void main(String[] args) {
//        Search The Given Element X  In The Array. if Present Then return The index else return -1
//        Linear Search  ...
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter Array Length : ");
        int a= Sc.nextInt();
        int arr [] = new int[a];
 Taking_Input:for(int i=0; i<arr.length; i++){
                       arr[i] = Sc.nextInt();
       }
        System.out.print("Enter The Element Which you Want To Find : ");
        int find = Sc.nextInt();
        int ans = -1;
        for(int i=0;i<arr.length; i++){
            if(find == arr[i]){
                ans =i;
                break;
            }
        }
        System.out.println("Found " + find + " At Index " + ans);

    }
}
