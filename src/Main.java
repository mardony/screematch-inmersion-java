import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Pelicula Matrix");
        // Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacionesUsuario = 0;

        String nombre = "Matrix";
        String sinopsis = """
                La menor pelicula del fin del milenio
                """;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5+4.8+3)/3;
        System.out.println("media de la evaluacion de matrix: "+mediaEvaluacion);

        if(fechaDeLanzamiento < 2023){
            System.out.println("pelicula popular en el momento");
        }else{
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i=0; i<3; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario=mediaEvaluacionesUsuario+notaMatrix;
        }
        System.out.println("la media de la pelicula Matrix calculada" +
                "por el usuario" + mediaEvaluacionesUsuario/3);
    }
}