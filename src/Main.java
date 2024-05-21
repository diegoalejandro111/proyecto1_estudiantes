import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("buen día tarde o noche: Por favor ingrese la cantidad de tus estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        int[] edades = new int[cantidadEstudiantes];

        // Ingreso de edades de los estudiantes
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("por favor ingresa la edad del estudiante " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        int promedioMayores = 0;
        int promedioMenores = 0;
        int cantidadCinco = 0;
        int totalMayores = 0;
        int totalMenores = 0;

        // este es el cálculo total de mayores y menores de 5 años, y la cantidad de estudiantes con 5 años
        for (int edad : edades) {
            if (edad > 5) {
                totalMayores += edad;
            } else if (edad < 5) {
                totalMenores += edad;
            } else {
                cantidadCinco++;
            }
        }

        // bueno chicos y chicas aqui evitsmos la división por cero
        if (cantidadEstudiantes - cantidadCinco > 0) {
            promedioMayores = totalMayores / (cantidadEstudiantes - cantidadCinco);
        }

        if (cantidadEstudiantes - cantidadCinco > 0) {
            promedioMenores = totalMenores / (cantidadEstudiantes - cantidadCinco);
        }

        System.out.println("*************************************************************");

        System.out.println("el promedio de edades mayores a 5 años es: " + promedioMayores);

        System.out.println("*************************************************************");

        System.out.println("el promedio de edades menores a 5 años es: " + promedioMenores);

        System.out.println("*************************************************************");

        System.out.println("la cantidad de estudiantes con 5 años es de: " + cantidadCinco);

        System.out.println("*************************************************************");

        System.out.println("¡¡FELICIDADES!! ¡¡Ve y sígueme en TikTok: @the_uno_porciento!!");
    }
}
