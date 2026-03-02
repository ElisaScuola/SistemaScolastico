
import java.time.LocalDate;

public class Voto{
    private LocalDate data;
    private Materia materia;
    private int valore;

    public Voto(LocalDate data, Materia materia, int valore){
        this.data = data;
        this.materia = materia;
        this.valore = valore;
    }

    public LocalDate getData(){
        return data;
    }

    public Materia getMateria(){
        return materia;
    }

    public int getValore(){
        return valore;
    }
}