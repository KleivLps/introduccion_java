import java.net.SocketOption;
import  java.util.Scanner;

public class operadoreDeComparacion {

    public static void main(String[] args) {

        //Operaciones aritmeticas: +,-,/,*,%

        System.out.println(" 5==5 = " +(5==5));
        System.out.println(" 5!=5 = " +(5!=5));
        System.out.println(" 5>5 = " +(5>5));
        System.out.println(" 5<5 = " +(5<5));
        System.out.println(" 5>=5 = " +(5>=5));
        System.out.println(" 5<=5 = " +(5<=5));
        System.out.println(" 5 <= 5 && 5 < 5 = " +(5 <= 5 && 5 < 5));
        System.out.println(" 5<=5 || 5 < 5 = " +(5 <= 5 || 5 < 5));
        System.out.println(" 5==5 = " +(5==5));
        System.out.println(" 5==5 = " +(5==5));

        /*Tabla de verdad del &&:
        valor = condicion1 && condicion2
        true = true && true
        false = false && true
        false = true && false
        false = false && false
        */

        /*Tabla de verdad del ||:
        valor = condicion1 || condicion2
        true = true && true
        true = false && true
        true = true && false
        false = false && false
        */

        /*int numero = 10;

        String resultado = numero % 5 == 0? "es divisible" : "no es divisible";
        System.out.println(numero+" "+resultado+" por 5");*/

        /*Operador Ternario
        variable = condicion ? valorSiCondicionEsVerdadera : valorSiCondicionEsFalsa;
        int numero = 10;*/

        int nota = 10;

        /*
        String resultado = numero % 5 == 0 ? "es divisible " : "no es divisible"
        System.out.println(numero+" "+resultado+" por 5 "));*/



        /*String resultado = nota > 8 ? "excelente" : "regular";*/
        /*String resultado = nota > 8 && nota <= 10 ? "excelente": "regular";*/

        String resultado = nota > 8 && nota <= 10 ? "excelente" : nota > 0 && nota <= 8 ? "regular" : "erronea";

        System.out.println( nota+ " es una calificacion " +resultado);










}
}

