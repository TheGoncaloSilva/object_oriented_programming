package aula08.ex_1;

public class Empresa_Aluguer {
    private String nome, codigo_postal, email;
    private int aux_viaturas;
    private Viatura[] viaturas;

    public Empresa_Aluguer(String nome, String codigo_postal, String email){
        this.nome = nome;
        this.codigo_postal = codigo_postal;
        this.email = email;
        this.viaturas = new Viatura[10];
    }

    public void inserir_viatura(Viatura obj){
        redimensionar_viatura();
        viaturas[aux_viaturas++] = obj;
    }

    public boolean encontrar_viatura(Viatura v){
        if(viaturas == null || aux_viaturas == 0) return false;
        for(int i = 0; i < aux_viaturas; i++){
            if(viaturas[i] == v) return true;
        }
        return false;
    }

    public void remover_viatura(Viatura v){
        if(!encontrar_viatura(v)) return;
        int i;
        for(i = 0; i <= aux_viaturas; i++){
            if(viaturas[i] == v) break;
        }
        for(; i < aux_viaturas; i++){
            viaturas[i] = viaturas[i+1];
        }
        aux_viaturas--;
    }

    private void redimensionar_viatura(){
        if(viaturas.length > aux_viaturas - 1) return;
        Viatura[] aux = new Viatura[viaturas.length + 10];
        for(int i = 0; i < viaturas.length; i++)
            aux[i] = viaturas[i];
        viaturas = aux;
    }

    public Viatura maior_distancia(){
        if(aux_viaturas == 0) return null;
        int km = 0, save = 0;
        for(int i = 0; i <= aux_viaturas; i++){
            if(viaturas[i].distanciaTotal() > km){
                km = viaturas[i].distanciaTotal();
                save = i;
            }
        }
        return viaturas[save];
    }

    public String getEmail(){ return this.email;	}
    public void setEmail(String email){ this.email = email; }
    public String getCodigo_Postal(){ return this.codigo_postal; }
    public void setCodigo_Postal(String codigo){ this.codigo_postal = codigo; }
    public String getNome(){ return this.nome;	}
    public void setNome(String nome){ this.nome = nome; }
    public Viatura[] getViaturas() { return this.viaturas; }
    public void setViaturas(Viatura[] viaturas) { this.viaturas = viaturas; }

    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***** Dados *****\n");
        sb.append("Nome: " + getNome() + "; Email: " + getEmail() + "; Código-Postal: " + getCodigo_Postal() + "\n");
        if(aux_viaturas > 0){
            sb.append("***** Viaturas *****\n");
            for(int i = 0; i <= aux_viaturas; i++){
                sb.append(viaturas[i]);
            }
        }else
            sb.append("***** Sem Viaturas *****\n");
        return sb.toString();
    }
}
