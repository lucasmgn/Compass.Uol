package questao8.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {

    private final String nome;

    private final BigDecimal salario;

    private String bonus;

    private String desconto;

    private BigDecimal salarioLiquido;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aplicarBonificacao(BigDecimal salarioLiquido) {
        int result = salarioLiquido.compareTo(new BigDecimal("1000"));

        //Se for menor ou igual a 1000
        if (result < 0 || result == 0 ) {
            // + 20%
            BigDecimal calculoSalarial = salarioLiquido.multiply(new BigDecimal("20")).divide(new BigDecimal(100));
            this.salarioLiquido = calculoSalarial.add(salarioLiquido);
            this.bonus = "20%";
            return;
        }

        result = salarioLiquido.compareTo(new BigDecimal("2000"));

        //se for menor que 2000 e maior que 1000
        if (result == -1) {
            // + 10%
            BigDecimal calculoSalarial = salarioLiquido.multiply(new BigDecimal("10")).divide(new BigDecimal(100));
            this.salarioLiquido = calculoSalarial.add(salarioLiquido);
            this.bonus = "10%";
            return;
        }

        //se for maior ou igual a 2000
        BigDecimal calculoSalarial = salarioLiquido.multiply(new BigDecimal("10")).divide(new BigDecimal(100));
        this.salarioLiquido = (calculoSalarial.subtract(salarioLiquido)).multiply(new BigDecimal("-1"));
        this.desconto = "10%";
        // - 10%

    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getBonus() {
        return bonus;
    }

    public String getDesconto() {
        return desconto;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalarioLiquido() {
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "\nFuncionário(a) " + nome +
                "\nSalário: " + salario.setScale(2,  RoundingMode.HALF_EVEN) + //formatando para ter apenas 2 numeros após a virgula
                "\nBônus: " + bonus +
                "\nSalário Líquido: " + salarioLiquido.setScale(2,  RoundingMode.HALF_EVEN);
    }
}
