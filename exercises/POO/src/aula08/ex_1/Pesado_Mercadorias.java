package aula08.ex_1;

public class Pesado_Mercadorias extends Pesado {
    private int carga_maxima;

    public Pesado_Mercadorias(String matricula, String marca, String modelo, String numero_quadro, int cilindrada, int peso, int carga_maxima){
        super(matricula, marca, modelo, numero_quadro, cilindrada, peso);
        this.carga_maxima = carga_maxima;
    }

    public int getPeso(){ return peso; }
    public void setPeso(int n){ peso = n; }
    public int getCarga_maxima() { return this.carga_maxima; }
    public void setCarga_maxima(int carga_maxima) { this.carga_maxima = carga_maxima; };

    @Override public boolean equals(Object obj){
        if(!(super.equals(obj))) return false;
        Pesado_Mercadorias mercadorias = (Pesado_Mercadorias) obj;
        return this.getCarga_maxima() == mercadorias.getCarga_maxima();
    }

    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString() + "\n");
        sb.append("Pesado de Mercadorias com carga máxima de " + getCarga_maxima());
        return sb.toString();
    }
}
