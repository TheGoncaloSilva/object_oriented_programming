public class Restaurante {
    private String nome;
    private TipoComida tipo;

    public Restaurante(String nome, TipoComida tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoComida getTipocomida() {
        return this.tipo;
    }

    public void setTipocomida(TipoComida tipo) {
        this.tipo = tipo;
    }

    public Restaurante nome(String nome) {
        setNome(nome);
        return this;
    }

    public Restaurante tipo(TipoComida tipo) {
        setTipocomida(tipo);
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Restaurante other = (Restaurante) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", tipodecomida='" + getTipocomida() + "'" +
            "}";
    }
    
}
