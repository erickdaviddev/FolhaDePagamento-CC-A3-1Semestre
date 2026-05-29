/*
Classe base que representa um colaborador genérico
Esta é a superclasse que define os atributos comuns a todos os funcionários.
 */
public class Colaborador {
    //Atributos básicos de identificação
    String nome;
    int numeroRegistro = 0; //Inicializada com 0 para evitar bugs

    //Constante imutável que define o piso salarial para todos os cargos
    final double SALARIO_BASE = 2000.00;

    /*
    Método criado para cálculo do salário final
    Na classe base (padrão), retorna apenas o valor fixo,
    nas classes filhas será sobrescrito para incluir bônus ou produção.
     */
    public double calcularSalarioFinal() {
        return SALARIO_BASE;
    }
}
