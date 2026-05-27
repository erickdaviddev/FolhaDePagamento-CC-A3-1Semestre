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

            switch (opcao){
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

                    System.out.print("Informe o valor vendido pelo comissionado: ");
                    double vendas = teclado.nextDouble();

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

                    System.out.print("Informe o valor por peça produzida(R$): ");
                    double valorPeca = teclado.nextDouble();

                    System.out.print("Informe a quantidade de peças produzidas: ");
                    int pecasProduzidas = teclado.nextInt();

                    FuncionarioProducao novoFuncionarioProducao = new FuncionarioProducao();
                    novoFuncionarioProducao.nome = nomeFuncionarioProducao;
                    novoFuncionarioProducao.numeroRegistro = numeroRegistroFuncionarioProducao;
                    novoFuncionarioProducao.valorPorPeca = valorPeca;
                    novoFuncionarioProducao.quantidadeDePecasProduzidas = pecasProduzidas;

                    lista.add(novoFuncionarioProducao);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
            }
        } while (opcao != 0 );
    }
}
