package prog.pkg07.clasenumero;

public class PROG07CLASENUMERO {

    public static void main(String[] args) {
        Clase num01 = new Clase(10);
        Clase num02 = new Clase();
        
        num01.cambiaNumero(100);
        num01.sumaNumero(100);
        num01.getCuadruple();
        num01.getCubo();
        num01.getFactorial();
        System.out.println(num01.getNumero());
        System.out.println(num01.getCuadruple());
        System.out.println(num01.getCubo());
        System.out.println(num01.getFactorial());
        
        

    }
    //Escribe en java una clase llamda mi numero que calcule el doble, triple y el cuadruple
    //de un numero, y permita sumarlo y restarlo con otros numeros
    //cuadrado. cubo y factorial

}
