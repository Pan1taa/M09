import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        BanyMixt banyMixt = new BanyMixt(5);
        ArrayList<Persona> personas = new ArrayList<>();


        personas.add(new Persona("paco el pajas","hombre", banyMixt));
        personas.add(new Persona("javier el rompeviejas","hombre", banyMixt));
        personas.add(new Persona("Ana la guarrona","mujer", banyMixt));
        personas.add(new Persona("Gertrudis la golosa","mujer", banyMixt));
        personas.add(new Persona("gabrielito el travieso","niño", banyMixt));
        personas.add(new Persona("joel el contador","niño", banyMixt));



        personas.forEach(persona -> {
            System.out.println(persona.getPersonName());
            persona.start();
        });
    }
}


