public class Ejercicio03a {


    public static void main(String[] args){

        int ladoA = Integer.valueOf(args[0]);
        int ladoB = Integer.valueOf(args[1]) ;

        int area = ladoB * ladoA;
        System.out.println("El rectangulo de " +
                ladoA + " por "+
                ladoB + ", tiene area: " + area +"\n");
    }
}