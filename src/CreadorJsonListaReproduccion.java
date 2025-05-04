import org.json.JSONArray;
import org.json.JSONObject;

public class CreadorJsonListaReproduccion {
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

            // Mostrar el JSON en la consola con formato legible
            System.out.println("JSON Generado:");
            System.out.println(lista.toString(2)); // El parámetro 2 es para indentación

        } catch (Exception e) {
            System.err.println("Error al generar el JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}