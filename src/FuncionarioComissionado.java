/*
Classe filha que extende (herda) os dados da superclasse e adiciona bônus
Representa o colaborador comissionado
 */
public class FuncionarioComissionado extends Colaborador {

    /*
     *Declaração das variaveis bônus para calculo das comissões
     *Atribuido inicialização 0 para evitar erros e bugs
     */
    double vendasRealizadas = 0.0;
    double percentualComissao = 0.0;

    //Metodo com calculo para retornar o salario final
    public double calcularSalarioFinal() {
        return SALARIO_BASE + (vendasRealizadas * percentualComissao/100);
    }
}