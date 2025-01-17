import java.net.MalformedURLException;
import java.net.URL;

public class Ejercicio02 {
    public static void main(String[] args) {
        try {
            // REVISAR
            // Crear un objeto URL
            URL direccion = new URL("https://www.google.com");

            // Recuperar protocolo, host de la URL
            System.out.println("Protocolo: " + direccion.getProtocol());
            System.out.println("Host: " + direccion.getHost());

        } catch (MalformedURLException e) {
            System.out.println("Error: URL mal formada.");
        }
    }
}
