
import java.util.Objects;

public class Materia{

    private String nome;
    private String sigla;

    public Materia(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia = (Materia) o;
        return Objects.equals(sigla, materia.sigla);
    }
}