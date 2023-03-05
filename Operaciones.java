import java.util.InputMismatchException;
public class Operaciones {
    /**
     * Recogemos el tipo de operación que quiere realizar el usuario así como los valores seleccionados.
     * @param n1 Valor dado por el usuario
     * @param n2 Valor dado por el usuario
     * @param operacion Para saber que tipo de operación hay que realizar
     * @return devolvemos el resultado
    **/
    public final double operacion(float n1, float n2, int operacion){
        double resultado = 0;
        try{
            switch(operacion){
                case 1:
                    resultado = n1+n2;
                break;
                case 2:
                    resultado = n1-n2;
                    break;
                case 3:
                    resultado = n1*n2;
                    break;
                case 4:
                    resultado = n1/n2;
                    break;
          }
        }catch(InputMismatchException ex){
            System.out.println(ex);
            System.out.println("Caracter invalido, ingrese un número");
        }
        return resultado;
    }
}