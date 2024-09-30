import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {
/*Programa para calcular el promedio de un grupo
 * El tamaño del grupo es N
 * Las calificaciones se leen y se almacenan en un arreglo de tamaño n*
 */

    public static Estudiante[] estudiantes;

     //Para lectura de datos
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    public static void leer_estudiantes()throws IOException{
        String matricula, nombre;
        for(int i = 0; i < estudiantes.length; i++ ){
            System.out.println("------------------------------");
            System.out.println("Informacion del estudiante [" + (i+0) + "]");
            System.out.println("Matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;  
            Estudiante e = new Estudiante(matricula, nombre);
            System.out.println("Escriba calificacion de Estructura de Datos: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de Evaluación: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de Inglés: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e;//Agregamos un objeto estudiante al arreglo
        }
    }
    public static void main(String[] args) throws IOException {
        int N; //El tamaño del arreglo
       
        //Arreglo de un Tipo de Dato Abstracto (TDA)


        //Arrelo Tipo de Dato Primitivo(double)
        double [] calificaciones;//Arreglo de calificaciones
        double suma = 0;//para sumas calificaciones 
        double promedio; //El promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo:");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //Construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];

        //Construimos el arreglo de calificaciones 
        calificaciones = new double[N];
        // //Leer las calificaciones de cada alumno
        // for( int i = 0; i < calificaciones.length; i++){
        //     System.out.println("Escribas las calificaciones del alumno:" + (i+1) + ": ");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }
        //  promedio = suma / N;


         System.out.println("Las calificaciones del grupo son:");
         for(int i = 0; i < calificaciones.length; i++){
            System.out.println(calificaciones[i]);
         }
         System.out.println("El promedio del grupo es:" + promedio);

    }
}

