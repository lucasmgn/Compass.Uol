package questao6.model;

public class Pergunta {

    private Long id;
    private String pergunta;
    private String resposta;

    public String getPergunta() {
        return pergunta;
    }

    public Long getId() {
        return id;
    }

    public Pergunta(Long id, String pergunta, String resposta) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public boolean isRespostaCorreta(String resposta){
        return this.resposta.equalsIgnoreCase(resposta);
    }
}
