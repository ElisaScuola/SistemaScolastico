import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Materia matematica = new Materia("Matematica", "MAT");

        Insegnante insegnante = new Insegnante(
                "Anna", "Nicolì", LocalDate.of(2008, 6, 3));
        insegnante.aggiungiMateria(matematica);

        Studente studente = new Studente(
                "Hamza", "Rekik", LocalDate.of(2008, 12, 16));

        Voto voto = new Voto(LocalDate.now(), matematica, 7);
        studente.aggiungiVoto(voto);


        System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome());
        System.out.println("Materia: " + matematica.getNome());
        System.out.println("Voto: " + voto.getValore());
    }
}
