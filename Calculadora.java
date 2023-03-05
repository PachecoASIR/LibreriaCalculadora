import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        /** Probamos que el usuario introduzca los parámetros solicitados
         * No fue posible solucionar que si el usuario escoge un número diferente entre los dados para seleccionar operación muestre error por pantalla.
        **/
        try{ System.out.println("Usted está ejecutando una calculadora, a continuación se le muestran las operaciones que esta puede realizar:\n 1) Suma\n 2) Resta\n 3) Multiplicación\n 4) División\n 5) Raíces\n Ingrese el número de la operación a realizar a continuación: ");
            final int operacion = sc.nextInt();
            System.out.println("Ingrese el primer número con el que desea operar (en caso de raices este número será el radicando): ");
            final float n1 = sc.nextInt();
            System.out.println("Ingrese el segundo número (en caso de raices este numero será el íncide: ");
            final float n2 = sc.nextInt();
            final double resultado = operaciones.operacion(n1,n2,operacion);
            if (resultado != 0) {
                System.out.println("Resultado: " + resultado);
            }
        }catch(InputMismatchException ex){
            System.out.println("Por favor, introduzca un número para seleccionar la operación.");
        }
    }
}