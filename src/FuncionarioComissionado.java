public class FuncionarioComissionado extends Colaborador {

    double vendasRealizadas;
    double percentualComissao;

    public double calcularSalarioFinal() {
        return SALARIO_BASE + (vendasRealizadas * percentualComissao/100);
    }
}