import java.util.LinkedList;
import java.util.List;

public class AgenciaTuristica {
  String nome = "";
  String endereco = "";
  List<Atividade> exp;

  public AgenciaTuristica(String nome, String endereco){
    this.nome = nome;
    this.endereco = endereco;
    this.exp = new LinkedList<>();
  }

  public void add(Gastronomia exp1) {

  }

  public void add(PasseioBicicleta pst1) {
    
  }

  public int totalItems() {
    return exp.size();
  }

  public List<Atividade> atividades() {
    return exp;
  }

  public Object getAllItems() {
    return null;
  }
}
