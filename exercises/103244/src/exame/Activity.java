package exame;

public abstract class Activity {
    private int participantes;

    public Activity(int participantes){
        this.participantes = participantes;
    }

    public abstract int getpreco();

    public int getParticipantes(){
        return participantes;
    }

    public abstract String toString();
}
