package ComposicionHerencia;

public class Principal {
    public static void main (String[] args){
        // Composicion
        Persona persona1 = new Persona();
        persona1.setDNI("321315661Y");

        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle nueva");
        direccion1.setNumero(71);
        direccion1.setProvincia("Cadiz");
        direccion1.setCiudad("Villamartin");

        persona1.Saludar();

        // Herencia
        Estudiante estudiante1 = new Estudiante(13, 7.4);

        Direccion direccion2 = new Direccion();
        direccion2.setCalle("Calle nueva");
        direccion2.setNumero(53);
        direccion2.setProvincia("Cadiz");
        direccion2.setCiudad("Villamartin");
    }
}