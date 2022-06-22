import java.util.LinkedHashSet;
import java.util.Set;

public class PasseioBicicleta {
  int n = 0;
  String nome = "";
  Set<String> locais;

  public PasseioBicicleta(int n, String nome) {
    this.n = n;
    this.nome = nome;
  }

  public PasseioBicicleta(int n, String nome, String[] locais) {
    this.n = n;
    this.nome = nome;
    this.locais = new LinkedHashSet<>();
    for(String local: locais){
      this.locais.add(local);
    }
  }

  public void addLocal(String local) {
    this.locais.add(local);
  }

  public String getNome() {
    return nome;
  }

  public String locais() {
    return "["+String.join(", ",locais)+"]";
  }
}
