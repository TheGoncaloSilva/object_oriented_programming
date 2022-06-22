import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;

public class PasseioBicicleta extends Atividade{
    private int numero;
    private String nome;
    private List<String> locais;

    public PasseioBicicleta(int numero, String nome, List<String> locais) {
        this.numero = numero;
        this.nome = nome;
        this.locais = locais;
    }

    public PasseioBicicleta(int numero, String nome, String[] locais) {
        this.numero = numero;
        this.nome = nome;
        this.locais = new LinkedList<>(Arrays.asList(locais));
        
    }

    public PasseioBicicleta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.locais = new LinkedList<>();
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

    public List<String> getLocais() {
        return this.locais;
    }

    public void setLocais(List<String> locais) {
        this.locais = locais;
    }

    public PasseioBicicleta numero(int numero) {
        setNumero(numero);
        return this;
    }

    public PasseioBicicleta nome(String nome) {
        setNome(nome);
        return this;
    }

    public PasseioBicicleta locais(List<String> locais) {
        setLocais(locais);
        return this;
    }

    public void addLocal(String local){
        locais.add(local);
    }

    public Collection<String> locais(){
        LinkedList<String> aux = new LinkedList<>();
        for(String a : locais)
            aux.add(a);
        return aux;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((locais == null) ? 0 : locais.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numero;
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
        PasseioBicicleta other = (PasseioBicicleta) obj;
        if (locais == null) {
            if (other.locais != null)
                return false;
        } else if (!locais.equals(other.locais))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numero != other.numero)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", nome='" + getNome() + "'" +
            ", locais='" + getLocais() + "'" +
            "}";
    }
}