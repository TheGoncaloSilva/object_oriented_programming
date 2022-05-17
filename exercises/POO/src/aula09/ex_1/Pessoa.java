package aula09.ex_1;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String name, int cc, Date dataNasc){
        if(valid(name, cc, dataNasc)){
            this.nome = name;
            this.cc = cc;
            this.dataNasc = dataNasc;
        }
    }

    public void set(String name, int cc, Date dataNasc){
        if(valid(name, cc, dataNasc)){
            this.nome = name;
            this.cc = cc;
            this.dataNasc = dataNasc;
        }
    }

    public String getNome(){ return nome; }
    public int getCC(){ return cc;}
    public Date getDataNasc(){ return dataNasc;}

    private static boolean valid(String name, int cc, Date dataNasc){
        return name != null && cc >= 10e6 && dataNasc != null;

    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + ", CC: " + getCC() + ", Data de Nascimento: " + getDataNasc();
    }
}
