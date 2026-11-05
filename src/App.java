import java.util.List;
import java.util.Scanner;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 25, "F"));

        //1. Busque una persona con nombre Maria
        //retorne la persona si lo encontro
        //2. Busque una persona con nombre Diego
        //retorne la persona si lo encontro
        //3. Busque una persona con nombre Ana
        //imprima la posicion de la persona si lo encontro
        
        
        BusquedaLineal busqueda = new BusquedaLineal(personas);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona a buscar: ");
        String name = scanner.nextLine();
        Persona personaEncontrada = busqueda.findByName(name);
        if (personaEncontrada != null) {
            System.out.println("Persona encontrada: " + personaEncontrada);
        } else {
            System.out.println("Persona no encontrada");
        }
        
        System.out.print("Ingrese el nombre de la persona a buscar para obtener su posición: ");
        String posicion = scanner.nextLine();
        int position = busqueda.findPosByName(posicion);
        if (position != -1) {
            System.out.println("La persona se encuentra en la posición: " + position);
        } else {
            System.out.println("Persona no encontrada");
        }
    }
}
