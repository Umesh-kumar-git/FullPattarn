import java.util.Scanner;
public class halfDiamond{

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int i,j,p;
        int n= input.nextInt();
        System.out.println("*");
        for ( i = 1; i <=n; i++) {
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(p=(i-1);p>=1;p--){
                System.out.print(p);
            }
            System.out.println("*");

        }
        for ( i = (n-1); i>= 1; i--) {
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(p=(i-1);p>=1;p--){
                System.out.print(p);
            }
            System.out.println("*");

        }
        System.out.println("*");
    }
}