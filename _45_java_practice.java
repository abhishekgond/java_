import java.util.Scanner;

public class _45_java_practice {
//    Write a program to find the sum of even digits of a given number with  continue keyword ?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The arrays length : ");
        int a = sc.nextInt();
        int arr[]= new int[a];
        int sum =0;
        forInput :for(int i=0;i<arr.length; i++){
                   arr[i] = sc.nextInt();
                }
                for (int i=0;i< arr.length; i++){
                    if(arr[i]%2 != 0){
//                        System.out.println("When !=0 "+arr[i]);
                        continue;
                    }
                    else{
//                        System.out.println("When ==0 "+arr[i]);
                        sum+=arr[i];
                    }
                }
        System.out.println("Even Number Sum IS : "+sum);

    }
}
