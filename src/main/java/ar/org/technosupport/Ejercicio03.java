public class Ejercicio03 {

    public static void main(String[] args){

        int numeroDeManzanas = Integer.valueOf(args[0]);
        int numeroDePeras = Integer.valueOf(args[1]);

        int numFrutas = numeroDeManzanas + numeroDePeras;

        System.out.println("tengo " + numFrutas + " frutas");

    }
}