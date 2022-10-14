package questao6;

import questao6.model.Pergunta;
import questao6.model.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
/*
    6. Escreva um programa Java que tem como objetivo ser um quiz de
        perguntas e respostas. Na tela, você perguntará ao usuário e ele
        responderá. Se o usuário acertar ou errar, você precisa informar se ele
        acertou ou errou e passar para próxima pergunta (enquanto houver
        próxima). Utilizem array para guardar as perguntas e respostas. Na tela
        perguntará ao usuário o nome, e por vez assim as perguntas, caso o
        usuário acerte ele demonstre os erros e acertos (como no exemplo abaixo):

        Usuário XPTO:
        Acertos: 6
        Erros:4
*/

    public static void main(String[] args) throws Exception {

        System.out.println(" ");
        System.out.println("=========================== Bem-vindo ao Compass.Quiz ============================\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Pergunta> perguntasERespostas = new ArrayList<>();

        Map<Long, Usuario> usuarios = new HashMap<>();

        usuariosFixos(usuarios);
        perguntasERespostasQuiz(perguntasERespostas);

        int opcao = 0;

        while (opcao != 3) {

            interfaceQuiz();

            try{
                System.out.print("Opcão: ");
                String opcaoEntrada = reader.readLine();
                opcao = Integer.parseInt(opcaoEntrada);

            }catch(Exception e){
                throw new Exception("Erro ao preencher nome de usuário, tente novamente");
            }

            switch (opcao) {
                case 1 -> cadastrarUsuarios(reader, usuarios, perguntasERespostas);
                case 2 -> verResultados(usuarios);
            }
        }
    }

    //interface do game
    private static void interfaceQuiz() {

        System.out.println("\nOlá usuário, abaixo tem as opções do Compass.Quiz");
        System.out.println(" Opcões :                                  ");
        System.out.println("           1. Jogar            ");
        System.out.println("           2. Ver Resultados              ");
        System.out.println("           3. Sair                     ");
        System.out.println(" ");
        System.out.println("==================================================================================");
    }

    //implementando usuarios fixos com a interface Map
    private static void usuariosFixos(Map<Long, Usuario> usuarios) {

        Usuario usuarioRaiz1 = new Usuario(1L, "magno");
        Usuario usuarioRaiz2 = new Usuario(2L, "marcelo");

        usuarios.put(1L, usuarioRaiz1);
        usuarios.put(2L, usuarioRaiz2);
    }

    //cadastrando usuários
    private static void cadastrarUsuarios(BufferedReader reader, Map<Long, Usuario> usuarios, List<Pergunta> perguntasERespostas)
            throws Exception {

        Long matricula;

        System.out.print("\nAntes de começarmos, por favor informe a sua matricula:");

        String matriculaInput = reader.readLine();
        matricula = Long.valueOf(matriculaInput);

        Usuario usuarioSalvo = usuarios.get(matricula);

        //caso não exista usuário com essa matricula, ele será cadastrado, já que a Key é a matricula
        if (usuarioSalvo == null){
            System.out.print("\nPor Favor informe o nome do usuário:");

            String nomeUsuarioFormatado = reader.readLine().replaceAll("\\s+", " ");
            usuarioSalvo = new Usuario(matricula, nomeUsuarioFormatado);
            usuarios.put(usuarioSalvo.getMatricula(), usuarioSalvo);
            System.out.println("\nUsuário cadastrado com sucesso!\n");

        }

        //chamada do método para iniciar o game
        listarPerguntasRespostasQuiz(reader, perguntasERespostas, usuarioSalvo);
    }

//  Perguntas e respostas criadas dentro da mesma classe, com o intuido de facilitar, evitando de criar outras listas ou Maps
    private static void perguntasERespostasQuiz(List<Pergunta> perguntasERespostas) {
        Pergunta pergunta1 = new Pergunta(1L, "Qual a linguagem de programação tem o nome baseado em um grão de café?", "java");
        Pergunta pergunta2 = new Pergunta(2L, "Qual o nome do personagem principal da franquia Dragon Ball Z?", "goku");
        Pergunta pergunta3 = new Pergunta(3L, "Qual o nome do apocalipse que acontece na série The Walking Dead?", "zumbi");

        perguntasERespostas.add(pergunta1);
        perguntasERespostas.add(pergunta2);
        perguntasERespostas.add(pergunta3);
    }

    //Método criado para validar as respostas do usuário com a resposta correta, e incrementar os erros e acertos
    private static void listarPerguntasRespostasQuiz(BufferedReader reader,List<Pergunta> perguntasERespostas, Usuario usuario) throws IOException {
        int questao = 1;

        for (Pergunta pergunta : perguntasERespostas) {

            System.out.println("\nPergunta " + questao + ".");
            System.out.print(pergunta.getPergunta());

            System.out.print("\nResposta:");
            String respostaUser = reader.readLine();
            respostaUser = respostaUser.toLowerCase();

            if(pergunta.isRespostaCorreta(respostaUser)) {
                System.out.print("Parabéns, você acertou!! :)\n");
                usuario.incrementoAcertos();
            }
            else{
                System.out.print("Sinto muito, você errou!! :(\n");
                usuario.incrementoErros();
            }
            questao++;
        }
    }

    //Imprimindo lista de usuários, com o resultados
    private static void verResultados(Map<Long, Usuario> usuarios) {
        for (Long key : usuarios.keySet()) {
            Usuario value = usuarios.get(key);
            System.out.println(value);
        }
    }
}