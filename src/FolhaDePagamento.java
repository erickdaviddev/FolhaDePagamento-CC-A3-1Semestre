import java.util.Scanner;
import java.util.ArrayList;

public class FolhaDePagamento {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Colaborador> lista = new ArrayList<>();

        int opcao;

        do{
            System.out.println("Informe o número da opção desejada (1, 2, 3, 4 ou 0)");
            System.out.println("Opção 1 - Cadastrar funcionário padrão");
            System.out.println("Opção 2 - Cadastrar fucionário comissionado");
            System.out.println("Opção 3 - Cadastrar funcionário produção");
            System.out.println("Opção 4 - Gerar folha de pagamento");
            System.out.println("Opção 0 - Sair do programa");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    teclado.nextLine();

                    System.out.print("Nome do Colaborador: ");
                    String nomeFuncionario = teclado.nextLine();

                    System.out.print("Número do Registro do Colaborador: ");
                    int numeroRegistroFuncionario = teclado.nextInt();

                    Colaborador novoFuncionarioPadrao = new Colaborador();
                    novoFuncionarioPadrao.nome = nomeFuncionario;
                    novoFuncionarioPadrao.numeroRegistro = numeroRegistroFuncionario;

                    lista.add(novoFuncionarioPadrao);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    teclado.nextLine();

                    System.out.print("Nome do Colaborador Comissionado: ");
                    String nomeFuncionarioComissionado = teclado.nextLine();

                    System.out.print("Número do Registro do Colaborador Comissionado: ");
                    int numeroRegistroFuncionarioComissionado = teclado.nextInt();

                    double vendas;

                    do {
                        System.out.print("Informe o valor vendido pelo comissionado (Não pode ser um valor negativo): ");
                        vendas = teclado.nextDouble();

                        if (vendas < 0) {
                            System.out.println("Erro! O valor das vendas não pode ser negativo!");
                        }
                    } while (vendas < 0);

                    System.out.print("Qual percentual (%) para comissão: ");
                    double percentual = teclado.nextDouble();

                    FuncionarioComissionado novoComissionado = new FuncionarioComissionado();
                    novoComissionado.nome = nomeFuncionarioComissionado;
                    novoComissionado.numeroRegistro = numeroRegistroFuncionarioComissionado;
                    novoComissionado.vendasRealizadas = vendas;
                    novoComissionado.percentualComissao = percentual;

                    lista.add(novoComissionado);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 3:
                    teclado.nextLine();

                    System.out.print("Nome do Colaborador por produção: ");
                    String nomeFuncionarioProducao = teclado.nextLine();

                    System.out.print("Número do Registro do Colaborador por produção: ");
                    int numeroRegistroFuncionarioProducao = teclado.nextInt();

                    double valorPeca;

                    do {
                        System.out.println("Informe o valor por peça produzida (Não pode ser um valor negativo): R$ ");
                        valorPeca = teclado.nextDouble();
                        if (valorPeca < 0) {
                            System.out.print("Erro! O valor das peças não pode ser negativo!");
                            valorPeca = teclado.nextDouble();
                        }
                    } while (valorPeca < 0);

                    int pecasProduzidas;

                    do {
                        System.out.print("Informe a quantidade de peças produzidas (Não pode ser um valor negativo): ");
                        pecasProduzidas = teclado.nextInt();
                        if (pecasProduzidas < 0) {
                            System.out.println("Erro! Quantidade de peças produzidas não pode ser um valor negativo!");
                        }
                    } while (pecasProduzidas < 0);

                    FuncionarioProducao novoFuncionarioProducao = new FuncionarioProducao();
                    novoFuncionarioProducao.nome = nomeFuncionarioProducao;
                    novoFuncionarioProducao.numeroRegistro = numeroRegistroFuncionarioProducao;
                    novoFuncionarioProducao.valorPorPeca = valorPeca;
                    novoFuncionarioProducao.quantidadeDePecasProduzidas = pecasProduzidas;

                    lista.add(novoFuncionarioProducao);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("--- RELATÓRIO DE FOLHA DE PAGAMENTO ---");
                    System.out.println("Total de colaboradores: " + lista.size());

                    for (Colaborador c: lista){
                        System.out.println("Nome do Colaborador: " + c.nome);
                        System.out.println("Salário Final: R$ " + c.calcularSalarioFinal());
                    }
            }
        } while (opcao != 0 );
    }
}
