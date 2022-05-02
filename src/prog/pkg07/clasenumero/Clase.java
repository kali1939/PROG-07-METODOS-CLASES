package prog.pkg07.clasenumero;

public class Clase {

    private int numero;
    int factorial = 1;
    int num = 5;

    public Clase(int numero) {
        this.numero = numero;
    }

    public Clase() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    void cambiaNumero(int num) {
        numero = num;
    }

    void sumaNumero(int num) {
        numero = numero + num;
    }

    void restaNumero(int num) {
        numero = numero - num;
    }

    public int getCuadruple() {
        return numero * 4;
    }

    public int getTriple() {
        return numero * 2;
    }

    public int getDoble() {
        return numero * 2;
    }

    public int getCuadrado() {
        return (int) Math.pow(numero, 2);
    }

    public int getCubo() {
        return (int) Math.pow(numero, 3);
    }

    public int getFactorial() {
        while (num > 0) {
            factorial = factorial * num;
            num = num - 1;
        }
        return factorial;
    }
}
