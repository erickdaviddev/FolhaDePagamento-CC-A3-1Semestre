import java.util.Scanner; //importa ferramenta Scanner (leitura do teclado/console)
import java.util.ArrayList; //importa a ferramenta ArrayList (Criação de listas)

public class FolhaDePagamento {
    public static void main (String[] args) { //Metodo principal
        Scanner teclado = new Scanner(System.in); //Objeto Scanner criado para leitura do teclado/console
        ArrayList<Colaborador> lista = new ArrayList<>(); //Objeto ArrayList para criação da lista dos colaboradores

        /*Variavel declarada fora do laço para escopo global
         * Inicializada com 0 para evitar erros e bugs
         */
        int opcao = 0;

        /* Laço para menu inicial
         * Possibilita que o usuário cadastre vários colaboradores e gere a folha
         */
        do{
            System.out.println("--- SISTEMA DE CADASTRAMENTO E FOLHA DE PAGAMENTO ---\n");
            System.out.println("Informe o número da opção desejada (1, 2, 3, 4 ou 0)\n");
            System.out.println("Opção 1 - Cadastrar funcionário padrão");
            System.out.println("Opção 2 - Cadastrar fucionário comissionado");
            System.out.println("Opção 3 - Cadastrar funcionário produção");
            System.out.println("Opção 4 - Gerar folha de pagamento");
            System.out.println("Opção 0 - Sair do programa");
            opcao = teclado.nextInt();

            //Condicional para cadastro dos colaboradores
            switch (opcao) {

                //Opções de cadastramento para colaborador padrão
                case 1:
                    teclado.nextLine(); //Limpa o buffer para eliminar o enter

                    System.out.print("Nome do Colaborador: "); //Solicita nome do colaborador
                    String nomeFuncionario = teclado.nextLine(); //Ler o nome digitado e armazena em nomeFuncionario

                    System.out.print("Número do Registro do Colaborador: "); //Solicita o registro do colaborador
                    int numeroRegistroFuncionario = teclado.nextInt(); //Ler o registro digitado e armazena em numeroRegistroFuncionario

                    /*Instanciação:
                     *Cria um novo objeto real na memória usando a palavra-chave 'new'
                     * 'novoFuncionarioPadrao' é uma instância da classe 'Colaborador'
                     */
                    Colaborador novoFuncionarioPadrao = new Colaborador();

                    /*Atribuição de atributos:
                     * Acessamos as propriedades do objeto usado o ponto (.)
                     * E atribuímos a elas os valores que foram capturados e armazenados anteriormente pelo Scanner
                     */
                    novoFuncionarioPadrao.nome = nomeFuncionario;
                    novoFuncionarioPadrao.numeroRegistro = numeroRegistroFuncionario;

                    /*Armazenamento:
                     * ArrayList é um "vetor aprimorado" que cresce dinamicamente.
                     * O metodo .add() insere o objeto que acabamos de criar e preencher dentro da lista
                     */
                    lista.add(novoFuncionarioPadrao);

                    //Mensagem final para confirmação do cadastro
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 2:
                    teclado.nextLine(); //Limpa o buffer para eliminar o enter

                    System.out.print("Nome do Colaborador Comissionado: "); //Solicita nome do colaborador
                    String nomeFuncionarioComissionado = teclado.nextLine(); //Ler o nome digitado e armazena em nomeFuncionarioComissionado

                    System.out.print("Número do Registro do Colaborador Comissionado: "); //Solicita o registro do colaborador
                    int numeroRegistroFuncionarioComissionado = teclado.nextInt();//Ler o registro digitado e armazena em numeroRegistroFuncionarioComissionado

                    double vendas = 0.0; //Variavel declarada para vendas e iniciada com 0 para evitar erro e bugs

                    /* Laço para validação do valor informado pelo usuário
                     * Evitando que o mesmo digite um valor negativo
                     */
                    do {
                        System.out.print("Informe o valor vendido pelo comissionado (Não pode ser um valor negativo): ");
                        vendas = teclado.nextDouble();

                        if (vendas < 0) { //Mensagem de erro para valores negativos
                            System.out.println("Erro! O valor das vendas não pode ser negativo!");
                        }
                    } while (vendas < 0); //O laço trava aqui se o valor for negativo

                    double percentual = 0.0; //Variavel declarada para percentual e iniciada com 0 para evitar erro e bugs

                    /* Laço para validação do valor informado pelo usuário
                     * Evitando que o mesmo digite um valor negativo
                     */
                    do {
                        System.out.print("Qual percentual (%) para comissão: ");
                        percentual = teclado.nextDouble();

                        if (percentual < 0){ //Mensagem de erro para valores negativos
                            System.out.println("Erro! O valor pencentual não pode ser negativo!");
                        }
                    } while (percentual < 0); // O laço trava aqui se o valor for negativo

                    /*Instanciação:
                     *Cria um novo objeto real na memória usando a palavra-chave 'new'
                     * 'novoFuncionarioPadrao' é uma instância da classe 'Colaborador'
                     */
                    FuncionarioComissionado novoComissionado = new FuncionarioComissionado();

                    /*Atribuição de atributos:
                     * Acessamos as propriedades do objeto usado o ponto (.)
                     * E atribuímos a elas os valores que foram capturados e armazenados anteriormente pelo Scanner
                     */
                    novoComissionado.nome = nomeFuncionarioComissionado;
                    novoComissionado.numeroRegistro = numeroRegistroFuncionarioComissionado;
                    novoComissionado.vendasRealizadas = vendas;
                    novoComissionado.percentualComissao = percentual;

                    /*Armazenamento:
                     * ArrayList é um "vetor aprimorado" que cresce dinamicamente.
                     * O metodo .add() insere o objeto que acabamos de criar e preencher dentro da lista
                     */
                    lista.add(novoComissionado);

                    //Mensagem final para confirmação do cadastro
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 3:
                    teclado.nextLine(); //Limpa o buffer para eliminar o enter

                    System.out.print("Nome do Colaborador por produção: "); //Solicita nome do colaborador
                    String nomeFuncionarioProducao = teclado.nextLine(); //Ler o nome digitado e armazena em nomeFuncionarioProducao

                    System.out.print("Número do Registro do Colaborador por produção: "); //Solicita o registro do colaborador
                    int numeroRegistroFuncionarioProducao = teclado.nextInt();

                    double valorPeca;

                    do {
                        System.out.println("Informe o valor por peça produzida (Não pode ser um valor negativo): R$ ");
                        valorPeca = teclado.nextDouble();
                        if (valorPeca < 0) {
                            System.out.print("Erro! O valor das peças não pode ser negativo!");
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

                    /*Instanciação:
                     *Cria um novo objeto real na memória usando a palavra-chave 'new'
                     * 'novoFuncionarioPadrao' é uma instância da classe 'Colaborador'
                     */
                    FuncionarioProducao novoFuncionarioProducao = new FuncionarioProducao();
                    novoFuncionarioProducao.nome = nomeFuncionarioProducao;
                    novoFuncionarioProducao.numeroRegistro = numeroRegistroFuncionarioProducao;
                    novoFuncionarioProducao.valorPorPeca = valorPeca;
                    novoFuncionarioProducao.quantidadeDePecasProduzidas = pecasProduzidas;

                    /*Armazenamento:
                     * ArrayList é um "vetor aprimorado" que cresce dinamicamente.
                     * O metodo .add() insere o objeto que acabamos de criar e preencher dentro da lista
                     */
                    lista.add(novoFuncionarioProducao);

                    //Mensagem final para confirmação do cadastro
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 4:
                    System.out.println("--- RELATÓRIO DE FOLHA DE PAGAMENTO ---");
                    System.out.println("Total de colaboradores: " + lista.size());

                    for (Colaborador c: lista){
                        System.out.println("Nome do Colaborador: " + c.nome);
                        System.out.println("Registro: " + c.numeroRegistro);
                        System.out.println("Salário Final: R$ " + c.calcularSalarioFinal());
                    }
                    break;

                case 0:
                    System.out.print("Encerrando o sistema, tenha um bom dia!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
                    break;
            }
        } while (opcao != 0 );
    }
}
