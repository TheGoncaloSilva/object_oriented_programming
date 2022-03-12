/* Calculate the average between point A and point B. The program
 must read the velocity v1 and v2, as well as distance d1 and d2.
 This represents the distance travelled, assuming a linear displacemente.

*/

package aula02;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex5_average_speed {
    public static void main(String[] args) {
        double v1, v2, p1, p2;
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Input the first measured velocity: ");
                v1 = sc.nextDouble();
                System.out.print("Input the last measured speed: ");
                v2 = sc.nextDouble();
                System.out.print("Input the first position: ");
                p1 = sc.nextDouble();
                System.out.print("Input the last position: ");
                p2 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Looks like you shouldn't be introducing that !!!");
                sc.next(); // Flush the bad input
            }
        }
    }
}
