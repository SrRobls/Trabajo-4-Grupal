package personas;
import java.util.*;

public class ListaPersonas {
    
    ArrayList<Persona> listaPersonas; // Atributo que identifica un vector de personas
    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>(); 
    }
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    
    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }
    
    public void borrarLista() {
        listaPersonas.removeAll(listaPersonas);
    }
    
}
