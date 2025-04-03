package controlador;

import modelo.Agenda;
import modelo.Contacto;

public class GestionaContacto {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.agregarContacto(new Contacto("Jc", "Rallas", "elviejito@email.com", "Calle 123", "123456789"));
        agenda.agregarContacto(new Contacto("rendon", "perro", "rendon@email.com", "Avenida 456", "987654321"));
        agenda.agregarContacto(new Contacto("puerto", "nobita", "nobita@email.com", "Calle 789", "111222333"));
        
    }
}
