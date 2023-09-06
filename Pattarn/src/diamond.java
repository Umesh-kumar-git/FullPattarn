import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        System.out.println("Enter the number of row but should be odd ");
        Scanner input = new Scanner(System.in);

        int N  = input.nextInt();

            int n1 = (N+1)/2;

            int j = 1;
            while (j<=n1){

                int space = 1;
                while (space<=n1-j){
                    System.out.print(" ");
                    space++;
                }
                int star=1;
                while (star <= ((2)*j-1)){
                    System.out.print("*");
                    star++;
                }
                j++;
                System.out.println();
            }


            int n2 =(N-1)/2;
              j =n2;
            while (j>=1) {

                int space = n2;
                while (space>=j) {
                    System.out.print(" ");
                    space--;

                }

                int star = 1;
                while (star<=((2)*j-1)){
                    System.out.print("*");
                    star++;
                }

                j--;
                System.out.println();

            }



        }


}
