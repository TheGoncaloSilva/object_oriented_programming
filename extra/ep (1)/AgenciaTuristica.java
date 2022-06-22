import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class AgenciaTuristica {
    private String nome;
    private String endereço;
    private List<Atividade> atividades;

    public AgenciaTuristica(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
        this.atividades = new LinkedList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public AgenciaTuristica nome(String nome) {
        setNome(nome);
        return this;
    }

    public AgenciaTuristica endereço(String endereço) {
        setEndereço(endereço);
        return this;
    }

    public void add(Atividade atividade){
        if(!atividades.contains(atividade))
            atividades.add(atividade);
    }

    public int totalItems(){
        return atividades.size();
    }

    public List<Atividade> atividades(){
        return this.atividades;
    }
    
    public Set<String> getAllItems(){
        Set<String> sortedSetAtividades = new TreeSet<>();
        for (Atividade atividade : atividades){
            sortedSetAtividades.add(atividade.getNome());
        }
        return sortedSetAtividades;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        AgenciaTuristica other = (AgenciaTuristica) obj;
        if (endereço == null) {
            if (other.endereço != null)
                return false;
        } else if (!endereço.equals(other.endereço))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", endereço='" + getEndereço() + "'" +
            "}";
    }

}
