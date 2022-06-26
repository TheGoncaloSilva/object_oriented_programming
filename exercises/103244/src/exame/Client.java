package exame;

import java.util.Objects;

public class Client implements Comparable<Client>{
    private String nome, localidade;

    public Client() {
    }

    public Client(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Client nome(String nome) {
        setNome(nome);
        return this;
    }

    public Client localidade(String localidade) {
        setLocalidade(localidade);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(nome, client.nome) && Objects.equals(localidade, client.localidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, localidade);
    }

    @Override
    public String toString() {
        return 
            " " + getNome() + "'" +
            " [" + getLocalidade() + "] ";
    }

    @Override
    public int compareTo(Client o) {
        return this.nome.compareTo(o.nome);
    }
}
