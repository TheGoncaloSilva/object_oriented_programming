/* Read a date and if its valid, output the number of days of the month.
 (dont forget leap years)
*/

package aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6_validate_date {
    public static void main(String[] args) {
        
    }
    public static int read_value(String message, Scanner sc) {
        int value;
        while (true){
            try {
                System.out.print(message);
                value = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Looks like you shouldn't be introducing that !!!");
                sc.nextLine(); // Flush the bad input
            }
        }
        return value;
    }
}
