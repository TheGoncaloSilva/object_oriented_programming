package aula07.ex_2;

public class DateND extends Date {

    private static final DateYMD compDate = new DateYMD();
    private int days;

    /** Default constructor */
    public DateND(int d, int m, int y){
        if(valid(d, m, y))
            this.days = calculateDays(d, m, y);
    }

    public int getDays(){ return days; }

    private static int calculateDays(int d, int m, int y){
        // Descobrir se é menor ou maior ao comparar as datas
        // Se a data for menor, então vamos incrementando em loop até serem iguais
        // Caso contrário é o inverso


        return 0;
    }

    @Override
    public String toString(){
        return "Days: " + getDays();
    }
}
