package Operacion;

import LibreriaES.EntradaSalida;

public class Operacion {
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;

    public static Float operar(int operacion, int es, String mensaje){
        Float num1 = EntradaSalida.entrada(mensaje, es);
        Float num2 = EntradaSalida.entrada(mensaje, es);
        Float resultado = null;

        switch (operacion){
            case SUMA :
                resultado = num1 + num2;
                break;
            case RESTA:
                resultado = num1 - num2;
                break;
            case MULTIPLICACION:
                resultado = num1 * num2;
                break;
            case DIVISION:
                resultado = num1 + num2;
                break;
            default:
                break;
        }
        return resultado;
    }
}
