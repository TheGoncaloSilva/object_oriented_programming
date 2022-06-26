package exame;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashSet;

public class EventManager {
    private String nome;
    Map<Client, LinkedHashSet<Event>> clientsEvents;

    public EventManager() {

    }

    public EventManager(String nome) {
        this.nome = nome;
        this.clientsEvents = new HashMap<>();
    }

    public EventManager(String nome, Map<Client, LinkedHashSet<Event>> clientsEvents) {
        this.nome = nome;
        this.clientsEvents = clientsEvents;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Client, LinkedHashSet<Event>> getclientsEvents() {
        return this.clientsEvents;
    }

    public void setclientsEvents(Map<Client, LinkedHashSet<Event>> clientsEvents) {
        this.clientsEvents = clientsEvents;
    }

    public Client addClient(String nome, String localidade){
        return new Client(nome, localidade);
    }

    public Event addEvent(Client client, LocalDate date){
        var event = new Event(date);

        if(clientsEvents != null && clientsEvents.containsKey(client)){
            var list = clientsEvents.get(client);
            list.add(event);
            clientsEvents.replace(client, list);
        }else{
            var list = new LinkedHashSet<Event>();
            list.add(event);
            clientsEvents.put(client, list);
        }

        return event;
    }

    public String listClients(){
        StringBuilder sb = new StringBuilder();

        Set<Client> clients = clientsEvents.keySet();
        for(Client cl: clients)
            sb.append(cl.toString() + "\n");
        
        return sb.toString();
    }

    public String listEvents(){
        StringBuilder sb = new StringBuilder();

        Set<Client> clients = clientsEvents.keySet();
        for(Client cl: clients){
            sb.append(cl.toString() + "\n");
            LinkedHashSet<Event> clEvent = clientsEvents.get(cl);
            for( Event ev: clEvent)
                sb.append(ev.toString() + "\n");
        }
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EventManager)) {
            return false;
        }
        EventManager eventManager = (EventManager) o;
        return Objects.equals(nome, eventManager.nome) && Objects.equals(clientsEvents, eventManager.clientsEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, clientsEvents);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", clientsEvents='" + getclientsEvents() + "'" +
            "}";
    }
}
