package questao6.model;

public class Pergunta {

    private Long id;
    private String pergunta;
    private String resposta;

    public String getPergunta() {
        return pergunta;
    }

    public Pergunta(Long id, String pergunta, String resposta) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    //Metodo para validar se a resposta está correta
    public boolean isRespostaCorreta(String resposta){
        return this.resposta.equalsIgnoreCase(resposta);
    }
}
