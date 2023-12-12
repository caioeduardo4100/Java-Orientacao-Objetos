package Operadores;

public class Subtracao extends Main {
    private int A, B;

    public Subtracao(int A, int B) {        //Classe filha (subclasse)
        super(A, B);
        this.A = A;
        this.B = B;
    }

    public int calculaSubtracao() {
        return A - B;
    }

    public int getA() {
        return (int) A;
    }

    public int getB() {
        return (int) B;
    }
}
