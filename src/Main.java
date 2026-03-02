import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Materia matematica = new Materia("Matematica", "MAT");

        Insegnante insegnante = new Insegnante(
                "Mario", "Rossi", LocalDate.of(1980, 5, 12));
        insegnante.aggiungiMateria(matematica);

        Studente studente = new Studente(
                "Luca", "Bianchi", LocalDate.of(2005, 3, 20));

        Voto voto = new Voto(LocalDate.now(), matematica, 8);
        studente.aggiungiVoto(voto);


        System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome());
        System.out.println("Materia: " + matematica.getNome());
        System.out.println("Voto: " + voto.getValore());
    }
}