package aula05.ex_3;

public class Triangulo implements Comparable<Triangulo> {
    private double[] sides;

    public Triangulo(double l1, double l2, double l3){
        if(l1 > 0 && l2 > 0 && l3 > 0){
            this.sides = new double[3];
            sides[0] = l1;
            sides[1] = l2;
            sides[2] = l3;
        }
    }

    public void setTriangulo(float l1, float l2, float l3){
        if(l1 > 0 && l2 > 0 && l3 > 0){
            this.sides = new double[3];
            sides[0] = l1;
            sides[1] = l2;
            sides[2] = l3;
        }
    }

    public double getS1(){ return (sides != null) ? sides[0] : null; }
    public double getS2(){ return (sides != null) ? sides[2] : null; }
    public double getS3(){ return (sides != null) ? sides[3] : null; }
    public double[] getSides(){ return (sides != null) ? sides : null; }

    @Override
    public String toString() {
        if(sides != null)
            return "Lado 1: " + getS1() + "; Lado 2: " + getS2() + "; Lado 3: " + getS3();
        return null;
    }

    @Override
    public boolean equals(Object n){
        Triangulo r = (Triangulo) n;
        double[] original = this.getSides(); // ordenar o array
        double[] aux = r.getSides(); // ordenar array
        boolean val = true;
        for(int i = 0; i < 3; i++){
            if(original[i] != aux[i]){
                val = false;
                break;
            }
        }
        return val;
    }

    @Override
    public int compareTo(Triangulo c){
        //if(this.raio < c.raio) return -1;
        //return (this.raio == c.raio) ? 0 : 1;
        return 0;
    }

    public static int calcularArea(int lado1, int lado2, int lado3){
        return 0;
    }
}
