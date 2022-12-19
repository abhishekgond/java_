import java.util.Scanner;
class  abhi_1{
    static  int find(int arr[]){
        Scanner Sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i] = Sc.nextInt();
        }

        for( int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }

            }

        }
        return -1;
    }
}
public class _51_Array_Problem {
    public static void  main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter The length of Arrays : ");
        int a = Sc.nextInt();
        int arr [] = new int[a];
        abhi_1 sc = new abhi_1();
        System.out.println(sc.find(arr));
    }
}
