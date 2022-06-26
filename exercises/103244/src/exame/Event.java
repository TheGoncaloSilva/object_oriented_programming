package exame;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Event implements IEvent, Comparable<Event> {
    private LocalDate date;
    private Set<Activity> listaAtividades;


    public Event() {

    }

    public Event(LocalDate date){
        this.date = date;
        this.listaAtividades = new LinkedHashSet<>();
    }

    public Event(LocalDate date, Set<Activity> listaAtividades) {
        this.date = date;
        this.listaAtividades = listaAtividades;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Activity> getListaAtividades() {
        return this.listaAtividades;
    }

    public void setListaAtividades(Set<Activity> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }

    public Event date(LocalDate date) {
        setDate(date);
        return this;
    }

    public Event listaAtividades(Set<Activity> listaAtividades) {
        setListaAtividades(listaAtividades);
        return this;
    }

        /*
    Event addActivity(Activity activity);
    double totalPrice();*/

    public Event addActivity(Activity activity){
        if(listaAtividades == null) return null;

        if(activity instanceof Catering){
            boolean found = false;
            for(Activity act : listaAtividades){
                if(act instanceof Catering){
                    found = true;
                    break;
                }
            }
            if(!found)
                listaAtividades.add(activity);
        }else{
            listaAtividades.add(activity);
        }

        return this;
    }

    public double totalPrice(){
        double price = 0.0;
        for(Activity act: listaAtividades){
            price += act.getpreco();
        }
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Event)) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("*** Evento em " + getDate() + ", total=" + totalPrice() + " euros \n");

        for(Activity act : listaAtividades){
            sb.append("\t" + act.toString() + "\n");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Event o) {
        return this.date.compareTo(o.date);
    }

}
