/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar: el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar: el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CuentaServicio {

    /// Inicializamos un Scanner para todos los métodos.
    Scanner leer = new Scanner(System.in);

    // Creamos el método que de alta las cuentas.
    public Cuenta altaCuenta() {

        /// Instanciamos un objeto del tipo cuenta.
        Cuenta c1 = new Cuenta();

        // Pedimos al usurario que ingrese el Nº de cuenta.
        System.out.println("Por favor introduzca el número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        // Pedimos al usurario que ingrese el valor de la altura.
        System.out.println("Por favor introduzca su DNI");
        c1.setDni(leer.nextLong());
        // Pedimos al usurario que ingrese el saldo actual.
        System.out.println("Por favor introduzca su saldo");
        c1.setSaldoActual(leer.nextInt());

        return c1;
    }

    public void ingresarSaldo(Cuenta c1) {

        System.out.println("Por favor ingrese el saldo a sumar");
        Double ingreso = leer.nextDouble();

        int saldoFinal;
        saldoFinal = (int) (c1.getSaldoActual() + ingreso);

        System.out.println("Tu cuenta paso del saldo: $" + c1.getSaldoActual() + ". Al saldo: $" + saldoFinal);
    }

    public void retirarSaldo(Cuenta c1) {

        System.out.println("Por favor ingrese el saldo a retirar");
        Double retiro = leer.nextDouble();

        if (retiro < c1.getSaldoActual()) {
            int saldoFinal = (int) (c1.getSaldoActual() - retiro);
            System.out.println("Tu cuenta paso del saldo: $" + c1.getSaldoActual() + ". Al saldo: $" + saldoFinal);
        } else {
            System.out.println("Tu saldo es cero");
        }
    }

    public void extraccionRapida(Cuenta c1) {

        System.out.println("Por favor ingrese el saldo a retirar");
        int retiro = leer.nextInt();

        if (retiro < (c1.getSaldoActual() / 0.2)) {
            int saldoFinal = c1.getSaldoActual() - retiro;
            System.out.println("Tu cuenta paso del saldo: $" + c1.getSaldoActual() + ". Al saldo: $" + saldoFinal);
        } else {
            System.out.println("No se puede extraer mas del 20% de tú saldo actual");
        }
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println(c1.toString());
    }

}
