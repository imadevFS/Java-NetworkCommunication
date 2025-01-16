import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ejercicio01 {
    public static void main(String[] args) {
        try {

            // Completa con los métodos de InetAdress

            // Mostrar nombre y dirección IP del host local (completar)
            System.out.println("Host: " + InetAddress.---); // Nombre y IP
            System.out.println("Nombre: " + InetAddress.---); // Solo el nombre
            System.out.println("IP: " + InetAddress.---); // Solo la IP

            // Obtener el objeto InetAddress de un host específico (completar)
            InetAddress host = InetAddress.getByName("www.elmundo.es"); // Cambia "www.elmundo.es" por el host que desees
            System.out.println("Nombre del host específico: " + ---);
            System.out.println("IP del host específico: " + ---);

        } catch (UnknownHostException e) {
            System.out.println("Error: Host no encontrado.");
        }
    }

}