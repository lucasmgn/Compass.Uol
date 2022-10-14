package questao7;

import questao7.model.Usuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Usuario> usuarios = new HashMap<>();

        usuariosFixos(usuarios);

        int opcao = 0;

        while (opcao != 4) {

            layout();

            try {
                System.out.print("Opcão: ");
                String opcaoEntrada = reader.readLine();
                opcao = Integer.parseInt(opcaoEntrada);
            } catch (Exception e) {
                System.out.println("Exception");
            }

            switch (opcao) {
                case 1 -> logar(reader, usuarios);
                case 2 -> cadastrarNovoUsuario(reader, usuarios);
                case 3 -> verUsuarios(usuarios);
            }
        }
    }

    //    layout da tela
    private static void layout() {
        System.out.println("\n=========================== Bem-vindo a Tela de Login da Compass.UOL ============================\n");
        System.out.println(" Opcões :                                  ");
        System.out.println("           1. Login            ");
        System.out.println("           2. Cadastrar            ");
        System.out.println("           3. Ver Usuários              ");
        System.out.println("           4. Sair                     ");
        System.out.println(" ");
        System.out.println("=====================================================================================================");
    }

    //Dois usuários fixos
    private static void usuariosFixos(Map<String, Usuario> usuarios) {
        Calendar c = Calendar.getInstance();
        int horaLogin = c.get(Calendar.HOUR_OF_DAY);

        Usuario usuarioRaiz1 = new Usuario("90744111005", "Lucas Magno Peixoto Lima", "12546", horaLogin);

        Usuario usuarioRaiz2 = new Usuario("31571695052", "Ivan Souza dos Santos", "36589", horaLogin);

        usuarios.put(usuarioRaiz1.getCpf(), usuarioRaiz1);
        usuarios.put(usuarioRaiz2.getCpf(), usuarioRaiz2);
    }

    //Metodo para fazer um login
    private static void logar(BufferedReader reader, Map<String, Usuario> usuarios) throws Exception {
        int opcao;

        System.out.print("Bem-vindo usuário, por favor, insira seu CPF: ");
        String cpf = reader.readLine();

        System.out.print("Agora informe sua senha: ");
        String senha = reader.readLine();

        Usuario usuarioSalvoCpf = usuarios.get(cpf);

        //Se o usuario não existir e a senha estiver errada
        if (usuarioSalvoCpf == null || !(senha.equals(usuarioSalvoCpf.getSenha()))) {
            System.out.println("Usuário e/ou senha incorretos.");
            System.out.print("Deseja criar um cadastro ? (1.Sim e 2.Não): ");

            String opcaoDeCriarCadastro = reader.readLine();
            opcao = Integer.parseInt(opcaoDeCriarCadastro);

            //se a opcao for igual a um, irá chmar a função para cadastrar um novo usuario
            if (opcao == 1) {
                cadastrarNovoUsuario(reader, usuarios);
            } else {
                System.out.println("Ok!");
            }
        }else {
            //verificação do horário para entregar mensagens especifica
            if (usuarioSalvoCpf.getHoraLogin() >= 6 && usuarioSalvoCpf.getHoraLogin() < 12) {
                System.out.println("\nBom dia, você se logou ao nosso sistema.");
            } else if (usuarioSalvoCpf.getHoraLogin() >= 12 && usuarioSalvoCpf.getHoraLogin() < 18) {
                System.out.println("\nBoa tarde, você se logou ao nosso sistema.");
            } else if (usuarioSalvoCpf.getHoraLogin() >= 18 && usuarioSalvoCpf.getHoraLogin() < 24) {
                System.out.println("\nBoa noite, você se logou ao nosso sistema.");
            } else if (usuarioSalvoCpf.getHoraLogin() >= 0 && usuarioSalvoCpf.getHoraLogin() < 6) {
                System.out.println("\nBoa madrugada, você se logou ao nosso sistema.");
            }
        }

    }

    //Cadastrando um novo usuário
    private static void cadastrarNovoUsuario(BufferedReader reader, Map<String, Usuario> usuarios) throws Exception {
        String nome;
        String cpfInput;
        String cpfFormatado;
        String senha;

        //Pegando o horário do computador
        Calendar c = Calendar.getInstance();
        int horaLogin = c.get(Calendar.HOUR_OF_DAY);

        System.out.println("\n============================ Cadastrando novo Usuário ============================\n");

        System.out.print("Por favor, informe seu nome de usuario: ");
        nome = reader.readLine();

        System.out.print("Agora informe, seu CPF: ");
        cpfInput = reader.readLine();
        cpfFormatado = cpfInput.replaceAll("[^0-9]", "");
        String cpf = cpfFormatado;

        Usuario usuarioSalvoCpf = usuarios.get(cpf);

        //verificação para o ver se o cpf é válido e se não já existe
        if(!isCpfValido(cpf) || usuarioSalvoCpf != null){
            throw new Exception("Desculpe, esse CPF não é válido");
        }

        System.out.print("Por último, crie uma senha: ");
        senha = reader.readLine();

        Usuario usuarioNovo = new Usuario(cpf, nome, senha, horaLogin);
        usuarios.put(usuarioNovo.getCpf(), usuarioNovo);

        System.out.println("\nUsuário cadastrado com sucesso!!");
    }

    //fazendo um forEach para imprimir uma lista de usuários
    private static void verUsuarios(Map<String, Usuario> usuarios) {
        System.out.println("\n========================== Lista de Usuários ==========================");
        for (String key : usuarios.keySet()) {
            Usuario valor = usuarios.get(key);
            System.out.println(valor);
        }
    }

    //validando um cpf, validação limitada pela minha lógica
    private static boolean isCpfValido(String cpf) {
        return !cpf.equals("00000000000") &&
                !cpf.equals("11111111111") &&
                !cpf.equals("22222222222") && !cpf.equals("33333333333") &&
                !cpf.equals("44444444444") && !cpf.equals("55555555555") &&
                !cpf.equals("66666666666") && !cpf.equals("77777777777") &&
                !cpf.equals("88888888888") && !cpf.equals("99999999999") &&
                (cpf.length() == 11);
    }
}
