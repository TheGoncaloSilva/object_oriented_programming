package exame;

import java.util.Objects;

public class Culture extends Activity {

    public enum Option{
        ARCHITECTURAL_TOUR,
        RIVER_TOUR,
        ART_MUSEUM,
        WINE_TASTING
    }

    public Culture.Option modalidade;

    public Culture(Culture.Option modalidade, int participantes){
        super(participantes);
        this.modalidade = modalidade;
    }

    public int getpreco(){
        return 22;
    }

    public Culture.Option getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(Culture.Option modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Culture)) {
            return false;
        }
        Culture culture = (Culture) o;
        return Objects.equals(modalidade, culture.modalidade);
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
