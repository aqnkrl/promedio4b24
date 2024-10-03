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


    public static void leerEstudiantes()throws IOException{
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

    public static void imprimirEstudiantes(){
        for(Estudiante e : estudiantes){
            System.out.println(e.toString());
        }
    }

    public static double calcularPromedioGrupo(){
        double suma = 0;

        for( Estudiante e : estudiantes){
            suma += e.getPromedio();
        }

        return suma / estudiantes.length;
    }
    public static void main(String[] args) throws IOException {
        int N; //El tamaño del arreglo
       
        //Arreglo de un Tipo de Dato Abstracto (TDA)


        double promedio; //El promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo:");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //Construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];

        //Lectura de la informacion de los estudiantes 
        leerEstudiantes();

        //Imprimir el contenido del arreglo estudiantes
       imprimirEstudiantes();

       //Calcular el promedio de grupo
       promedio = calcularPromedioGrupo();

        System.out.println("El promedio del grupo es:" + promedio);

    }
}

