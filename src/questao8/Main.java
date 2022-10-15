package questao8;

import questao8.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//    Escreva um programa Java que tem como objetivo validar se um
//    determinado funcionário tem direito a bonificação. O programa precisa
//    receber a quantidade de funcionários que serão cadastrados e após isso, o
//    programa deve armazenar o nome e o salário de cada funcionário. Se o
//    usuário receber até R$ 1000,00 reais, receberá 20% de bonificação. Se
//    receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de
//     2000, em vez de bonificação, o funcionário terá um desconto de 10%. No
//    fim do programa, deverá ter uma saída com os nomes dos funcionários,
//    salário, bônus ou desconto e salário líquido. (Utilizem arrays para
//    armazenar os dados.)

//    Exemplo:
//            • Funcionário XPTO
//              • Salário: 1200,00
//              • Bônus: 120,00
//              • Salário Líquido: 1320,00

//            • Funcionário XYZ
//              • Salário: 3000,00
//              • Desconto: 300,00
//              • Salário Líquido: 2700,00

//           • Funcionário ABC
//              • Salário: 700,00
//              • Bônus: 140,00
//              • Salário Líquido: 840,00

    public static void main(String[] args) throws Exception {

        //trabalhando com o scanner agora
        Scanner input = new Scanner(System.in);
        int quantidadeDeFuncionariosaSerCadastrados;
        int numero = 1;

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("\n=========================== Bem-vindo ao Cadastro de Funcionários(as) da Compass.UOL ============================\n");
        try{
            System.out.print("Quantos funcionários(as) você quer cadastrar: ");
            quantidadeDeFuncionariosaSerCadastrados = input.nextInt();
        }catch (Exception e){
            throw new Exception("Insira um número válido");
        }

        while (numero <= quantidadeDeFuncionariosaSerCadastrados) {
            cadastrandoFuncionario(input, funcionarios);
            numero++;
        }


    }

    //    Cadastrando funcionários
    private static void cadastrandoFuncionario(Scanner input, List<Funcionario> funcionarios){

        String nome;
        String salarioInput;

        System.out.println("\n=========================== Cadastrando Funcionário(a) =============================\n");

        System.out.print("Digite o nome completo do funcionário(a): ");
        nome = input.next();
        input.nextLine();

        System.out.print("Digite o salário do funcionário(a)(xxx.xx): ");
        salarioInput = input.next();
        BigDecimal salarioBigDecimal = new BigDecimal(salarioInput);

        //utilizando o metodo aplicarBonificacao para dar bonus ou desconto a depender do salário
        Funcionario funcionario = new Funcionario(nome, salarioBigDecimal);
        funcionario.aplicarBonificacao(salarioBigDecimal);
        funcionarios.add(funcionario);

        System.out.println("\n==================== Funcionário(a) Cadastrado com Sucesso!! ====================\n");

        verFuncionario(funcionarios);
    }

    //Mostrando lista de funcionários, fiz a impressão com o Desconto e com o toString normal que leva o bônus
    private static void verFuncionario(List<Funcionario> funcionarios) {

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getBonus() == null) {
                System.out.println("\nFuncionário(a) " + funcionario.getNome());
                System.out.println("Salário: " + funcionario.getSalario().setScale(2,  RoundingMode.HALF_EVEN));
                System.out.println("Desconto: " + funcionario.getDesconto());
                System.out.println("Salário Líquido: " + funcionario.getSalarioLiquido().setScale(2,  RoundingMode.HALF_EVEN));
            }else if(funcionario.getDesconto() == null){
                System.out.println(funcionario);
            }
        }
    }

}
