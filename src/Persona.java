    import java.time.LocalDate;

    public abstract class Persona{
        private String nome;
        private String cognome;
        private LocalDate dataDiNascita;

        public Persona(String nome, String cognome, LocalDate dataDiNascita){
            this.nome = nome;
            this.cognome = cognome;
            this.dataDiNascita = dataDiNascita;
        }

        public String getNome(){
            return nome;
        }

        public String getCognome(){
            return cognome;
        }

        public LocalDate getDataDiNascita(){
            return dataDiNascita;
        }
    }

