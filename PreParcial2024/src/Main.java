import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();


        Persona persona1 = new PersonaImpl();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEdad(30);

        Persona persona2 = new PersonaImpl();
        persona2.setNombre("Maria");
        persona2.setApellido("Gomez");
        persona2.setEdad(25);


        listaPersonas.add(persona1);
        listaPersonas.add(persona2);


        String nombreBuscado = "Juan";
        Persona personaEncontrada = null;
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equals(nombreBuscado)) {
                personaEncontrada = persona;
                break;
            }
        }


        if (personaEncontrada != null) {
            personaEncontrada.setEdad(35);
        } else {
            System.out.println("Persona no encontrada.");
        }


        Iterator<Persona> iterator = listaPersonas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getNombre().equals("Maria")) {
                iterator.remove();
                break;
            }
        }


        System.out.println("Lista de personas:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido() + ", Edad: " + persona.getEdad());
        }
    }
}