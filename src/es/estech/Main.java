package es.estech;

public class Main {

    /**
     * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
     *
     * El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumplan lo anterior.
     *
     * Crea sus métodos get, set y toString.
     *
     * Tendrá dos métodos especiales:
     *
     * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
     *
     * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
     *                                                                                      chla cantidad de la cuenta pasa a ser 0.
     */


    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta ("Cuenta prueba", 100);
        Cuenta cuenta2 = new Cuenta ("cuenta sin cantidad");


        cuenta2.setCantidad(200);


        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.ingresar(100);

        System.out.println(cuenta1);

        cuenta1.ingresar(-1000);

        System.out.println(cuenta1);

        cuenta1.retirar(150);
        System.out.println(cuenta1);

        cuenta1.retirar(100);
        System.out.println(cuenta1);


    }
}
