/*
*Classe filha que extende (herda) a superclasse adicionando bonus por peças produzidas
*Representa o colaborador produtivo
 */
public class FuncionarioProducao extends Colaborador{

    /*
     *Declaração das variaveis por produção
     *Atribuido inicialização 0 para evitar erros e bugs
     */
    double valorPorPeca = 0.0;
    int quantidadeDePecasProduzidas = 0;

    //Metodo com calculo que retornar o salario final
    public double calcularSalarioFinal() {
        return SALARIO_BASE + (valorPorPeca*quantidadeDePecasProduzidas);
    }
}