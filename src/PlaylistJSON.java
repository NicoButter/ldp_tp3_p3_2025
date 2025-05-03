import org.json.JSONArray;
import org.json.JSONObject;

public class PlaylistJSON {
    public static void main(String[] args) {
        JSONObject playlist = new JSONObject();
        playlist.put("nombre", "Lo mejor del rock");
        playlist.put("descripcion", "Clásicos del rock de todos los tiempos");

        JSONArray canciones = new JSONArray();

        JSONObject cancion1 = new JSONObject();
        cancion1.put("titulo", "Bohemian Rhapsody");
        cancion1.put("artista", "Queen");
        cancion1.put("duracion", "5:55");

        JSONObject cancion2 = new JSONObject();
        cancion2.put("titulo", "Hotel California");
        cancion2.put("artista", "Eagles");
        cancion2.put("duracion", "6:30");

        canciones.put(cancion1);
        canciones.put(cancion2);

        playlist.put("canciones", canciones);

        System.out.println(playlist.toString(4)); // Imprime con indentación
    }
}
