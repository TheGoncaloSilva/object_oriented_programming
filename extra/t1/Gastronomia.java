import java.util.LinkedList;
import java.util.List;

public class Gastronomia {
  int n;
  String nome;
  List<Restaurante> lista;

  public Gastronomia(int n, String nome) {
    this.n = n;
    this.nome = nome;
    this.lista = new LinkedList<>();
  }

  public Gastronomia(int n, String nome, List<Restaurante> lista) {
    this.n = n;
    this.nome = nome;
    this.lista = lista;
  }

  public void add(Restaurante restaurante) {
    this.lista.add(restaurante);
  }

  public String getNome() {
    return nome;
  }

  public List<Restaurante> getLista() {
    return lista;
  }

  public int totalRestaurantes() {
    return this.lista.size();
  }

  public String locais() {
    return lista.toString();
 
  }
}
