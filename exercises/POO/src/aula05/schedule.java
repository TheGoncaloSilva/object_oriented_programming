package aula05;

import java.util.Calendar;

public class schedule {
    private int year, week_day;

    /** Default constructor */
    public schedule(){
        this(Calendar.YEAR, 1);
    }
    
    public schedule(int y, int d){
        this.year = y;
        this.week_day = d;
    }
    
    public int getYear(){ return year;}
    public int getFirstWeekdayOfYear(){ return week_day;}

    public int firstWeekdayOfMonth(int month) {
        return 1;
    }

    public static void printMonth(int month){
        
    }

    public String toString(){
        return "potatos";
    }
}
