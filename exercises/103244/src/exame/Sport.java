package exame;

import java.util.Objects;

public class Sport extends Activity {
    
    public enum Modality{
        KAYAK,
        HIKING
    }

    private Sport.Modality modalidade;

    public Sport(Sport.Modality modalidade, int participantes){
        super(participantes);
        this.modalidade = modalidade;
    }

    public int getpreco(){
        return 30;
    }

    public Sport.Modality getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(Sport.Modality modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) o;
        return Objects.equals(modalidade, sport.modalidade);
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
