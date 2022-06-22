import java.util.List;
import java.util.LinkedList;
import java.util.Collection;

public class Gastronomia extends Atividade {
    private int numero;
    private String nome;
    private List<Restaurante> restaurantes;

    public Gastronomia(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.restaurantes = new LinkedList<>();
    }

    public Gastronomia(int numero, String nome, List<Restaurante> restaurantes) {
        this.numero = numero;
        this.nome = nome;
        this.restaurantes = restaurantes;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Restaurante> getLista() {
        return this.restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public Gastronomia numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Gastronomia nome(String nome) {
        setNome(nome);
        return this;
    }

    public Gastronomia restaurantes(List<Restaurante> restaurantes) {
        setRestaurantes(restaurantes);
        return this;
    }

    public Collection<String> locais(){
        LinkedList<String> aux = new LinkedList<>();
        for(Restaurante r : restaurantes)
            aux.add("Restaurante " + r.toString());
        return aux;
    }

    public int totalRestaurantes(){
        return restaurantes.size();
    }

    public void add(Restaurante restaurante){
        restaurantes.add(restaurante);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numero;
        result = prime * result + ((restaurantes == null) ? 0 : restaurantes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Gastronomia other = (Gastronomia) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numero != other.numero)
            return false;
        if (restaurantes == null) {
            if (other.restaurantes != null)
                return false;
        } else if (!restaurantes.equals(other.restaurantes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", nome='" + getNome() + "'" +
            ", restaurantes='" + getLista() + "'" +
            "}";
    }


}
