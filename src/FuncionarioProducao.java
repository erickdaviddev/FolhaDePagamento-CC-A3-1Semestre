public class FuncionarioProducao extends Colaborador{

    double valorPorPeca;
    int quantidadeDePecasProduzidas;

    public double calcularSalarioFinal() {
        return SALARIO_BASE + (valorPorPeca*quantidadeDePecasProduzidas);
    }
}