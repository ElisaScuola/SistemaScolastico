
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Insegnante extends Persona {

    private List<Materia> materie = new ArrayList<>();

    public Insegnante(String nome, String cognome, LocalDate dataDiNascita) {
        super(nome, cognome, dataDiNascita);
    }

    public List<Materia> getMaterie() {
        return materie;
    }

    public void aggiungiMateria(Materia materia) {
        if (!materie.contains(materia)) { // controllo duplicati
            materie.add(materia);
        }
    }
}