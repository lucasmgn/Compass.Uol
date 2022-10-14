package questao6.model;

public class Usuario {

    private final Long matricula;

    private final String nome;

    private int acertos;

    private int erros;

    public Usuario(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void incrementoAcertos(){
        this.acertos++;
    }

    public void incrementoErros(){
        this.erros++;
    }

    @Override
    public String toString() {
        return "\nUsuário " + nome + ":\n" +
                "Acertos: "+ acertos +"\n" +
                "Erros: " + erros + "\n";
    }
}

