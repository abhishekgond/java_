import java.util.Scanner;
class abhi{
    void pattern_printing(int a){

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
    void pattern_printing_1(int a){

        for(int i=a; i>=1; i--){
            for(int j=1; j<=i-1; j++ ){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

//         2nd method for solving this problem
        for(int i=1; i<=a; i++){
            for(int j=1; j<=(a+1-i); j++ ){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

    void line_end(){
        System.out.println("-------------------------------------------------------------------------");
    } void line_open(){
        System.out.println("-------------------------------------------------------------------------");
    }

}
public class _21_loop_problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        abhi ab = new abhi();
        ab.line_open();
        ab.pattern_printing(a);
        ab.line_end();
        ab.line_open();
        ab.pattern_printing_1(a);
        ab.line_end();
    }
}
