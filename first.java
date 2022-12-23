import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array length : ");
        int a = sc.nextInt();
        int arr [] = new int [a];
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
        int t = sc.nextInt();
        for(int i=0;i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){
               if(arr[i] + arr[j] == t){
                   System.out.println(i + ","+j);
               }
           }
        }
    }
}