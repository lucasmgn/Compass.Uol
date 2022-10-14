package questao7.model;

public class Usuario {

    private final String cpf;

    private final String nome;

    private final String senha;

    private final int horaLogin;

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public int getHoraLogin() {
        return horaLogin;
    }

    //construtor para não utilizar metodos set
    public Usuario(String cpf, String nome, String senha, int horaLogin) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.horaLogin = horaLogin;
    }

    //de objeto para string
    @Override
    public String toString() {
        return   "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n";
    }
}
