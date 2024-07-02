import java.util.Scanner;

public class nombreScanner {

    public static void main(String[] args) {

        Scanner Nombre = new Scanner(System.in);
        Scanner Edad = new Scanner(System.in);

        String nombre = "kleiver";
        int edad = 28;

        System.out.print("Hola!! cual es tu nombre:");

        nombre= Nombre.nextLine();

        System.out.println("Mi nombre es:"+nombre);

        System.out.print("¿Cual es tu edad?:");

        edad = Edad.nextInt();

        System.out.print("Tengo "+edad+" años ");
    }
}