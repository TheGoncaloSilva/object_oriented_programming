/* Program that transforms a value in seconds to a date type
 in the format hh:mm:ss (utilize %)
*/

package aula02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6_seconds_to_date {
    public static void main(String[] args) {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Input the amount of seconds: ");
                value = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Looks like you shouldn't be introducing that !!!");
                sc.next(); // Flush the bad input
            }

        }
        
        int[] date = build_date(value);
        
        System.out.printf("The seconds introduced correspond to %d:%d:%d ", date[0], date[1], date[2]);
        sc.close();
    }
    public static int[] build_date(int value) {
        // value is the original seconds
        int[] date = new int[3];
        int seconds = 0, minutes = value / 60;
        System.out.println(3601%60);
        if(value < 60){
            date[0] = 0;
            date[1] = 0;
            date[2] = value;
        }else if(minutes < 60){
            date[0] = 0;
            date[1] = minutes;
            date[2] = value % 60;
        }else if(minutes >= 60){
            date[0] = minutes / 60;
            minutes = minutes % 60;
            if(date[0] > 24){
                date[0] = 24;
                date[1] = 0;
                date[2] = 0;
            }else if(minutes < 60){
                date[1] = minutes;
                date[2] = 0;
            }else { // seconds >= 60
                date[1] = seconds / 60;
                date[2] = seconds % 60;
            }
        }
        
        
        return date;

        
        
    }

}
