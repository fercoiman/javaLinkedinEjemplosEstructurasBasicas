public class Ejercicio02a {
    public static void main(String[] args) {

        if (args.length == 1) {
            System.out.println("He recibido este argumento: " +
                                args[0] );
        }
        else{
            System.out.println("Debe pasar 1 argumento en total");
        }
    }
}