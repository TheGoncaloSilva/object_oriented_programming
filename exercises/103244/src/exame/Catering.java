package exame;

import java.util.Objects;

public class Catering extends Activity{

    public enum Option{
        FULL_MENU, 
        DRINKS_AND_SNACKS, 
        LIGHT_BITES, 
    }
    private Catering.Option modalidade;

    public Catering(Catering.Option Option, int participantes){
        super(participantes);
        this.modalidade = Option;
    }

    public Catering.Option getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(Catering.Option modalidade) {
        this.modalidade = modalidade;
    }

    public int getpreco(){
        return 25;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Catering)) {
            return false;
        }
        Catering catering = (Catering) o;
        return Objects.equals(modalidade, catering.modalidade);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(modalidade);
    }

    @Override
    public String toString() {
        return getModalidade() + " activity with " + getParticipantes() + " participants.";
    }

}
