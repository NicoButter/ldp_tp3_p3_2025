import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Clase que genera un documento JSON para representar una lista de reproducción de Spotify
 * utilizando la librería org.json. Este programa crea una lista de reproducción con canciones
 * y muestra el contenido en formato JSON en la consola, cumpliendo con el ejercicio 3 del
 * Trabajo Práctico 3 de la materia Laboratorio de Programación, correspondiente a la carrera
 * Licenciatura en Sistemas de la Universidad Nacional de la Patagonia Austral (UNPA), año 2025.
 * 
 * @author Nicolas Buttefield
 * @version 1.0
 * @since 2025-05-04
 */

 public class CreadorJsonListaReproduccion {
    /**
     * Método principal que crea un documento JSON representando una lista de reproducción
     * con canciones y lo muestra en la consola. La lista incluye un identificador, nombre,
     * descripción, creador y un arreglo de canciones, cada una con título, artista, álbum,
     * duración y género.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     * @throws Exception Si ocurre un error al construir o mostrar el JSON.
     */
    public static void main(String[] args) {
        try {
            // Crear el arreglo de canciones
            JSONArray canciones = new JSONArray();

            // Canción 1
            JSONObject cancion1 = new JSONObject();
            cancion1.put("titulo", "Bohemian Rhapsody");
            cancion1.put("artista", "Queen");
            cancion1.put("album", "A Night at the Opera");
            cancion1.put("duracion", 354);
            cancion1.put("genero", "Rock");
            canciones.put(cancion1);

            // Canción 2
            JSONObject cancion2 = new JSONObject();
            cancion2.put("titulo", "Shape of You");
            cancion2.put("artista", "Ed Sheeran");
            cancion2.put("album", "÷");
            cancion2.put("duracion", 233);
            cancion2.put("genero", "Pop");
            canciones.put(cancion2);

            // Canción 3
            JSONObject cancion3 = new JSONObject();
            cancion3.put("titulo", "Blinding Lights");
            cancion3.put("artista", "The Weeknd");
            cancion3.put("album", "After Hours");
            cancion3.put("duracion", 200);
            cancion3.put("genero", "Synthpop");
            canciones.put(cancion3);

            // Crear el objeto de la lista de reproducción
            JSONObject lista = new JSONObject();
            lista.put("id", "PL123");
            lista.put("nombre", "Mis Éxitos Favoritos");
            lista.put("descripcion", "Una colección de mis canciones favoritas de varios géneros");
            lista.put("creador", "JuanPerez");
            lista.put("canciones", canciones);

            // Mostrar la salida decorada
            System.out.println("==================================================");
            System.out.println("** Ejercicio 3 - Trabajo Práctico 3 **");
            System.out.println("** Materia: Laboratorio de Programación **");
            System.out.println("** Carrera: Licenciatura en Sistemas, UNPA 2025 **");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("Generando documento JSON para una lista de reproducción de Spotify...");
            System.out.println("Estructura del JSON:");
            System.out.println("- Lista de reproducción: id, nombre, descripción, creador, canciones.");
            System.out.println("- Canciones: título, artista, álbum, duración (segundos), género.");
            System.out.println();
            System.out.println("** Inicio del JSON **");
            System.out.println("--------------------------------------------------");
            System.out.println(lista.toString(2)); // JSON con indentación
            System.out.println("--------------------------------------------------");
            System.out.println("** Fin del JSON **");
            System.out.println();
            System.out.println("JSON generado exitosamente.");
            System.out.println("==================================================");

        } catch (Exception e) {
            System.err.println("==================================================");
            System.err.println("Error al generar el JSON: " + e.getMessage());
            System.err.println("==================================================");
            e.printStackTrace();
        }
    }
}
