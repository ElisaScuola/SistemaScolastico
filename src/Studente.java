import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;

public class Studente extends Persona{

    private ArrayList<Voto> voti = new ArrayList<>();;

    public Studente(String nome, String cognome, LocalDate dataDiNascita){
        super(nome, cognome, dataDiNascita);
    }

    public ArrayList<Voto> getVoti(){
        return voti;
    }

    public void aggiungiVoto(Voto voto){
        voti.add(voto);
    }
}
