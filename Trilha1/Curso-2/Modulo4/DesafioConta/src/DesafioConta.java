import java.util.Scanner;

public class DesafioConta {
    public static void main(String[] args) {
        String nomecliente = ("Wanessa gomes da camara silva");
        double saldoConta = 2000;
        String tipoDeConta = ("conta corrente");
        int opcaoEscolhida = 0;

        String mensagem = """
                                
                Bem vinda de volta! \n
                Nome do titular:        %s
                Tipo de conta :         %s
                Seu saldo atual é de:   R$ %.2f
                                
                """.formatted(nomecliente, tipoDeConta, saldoConta);
        System.out.println(mensagem);

        String menu = """
                \nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                Operações disponiveis para sua conta:
                               
                 1-Consultar saldo
                 2-Transferir valor
                 3-Receber valor
                 4-sair
                xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                """;

        Scanner opcao = new Scanner(System.in);


        while (opcaoEscolhida != 4) {
            System.out.println(menu);
            opcaoEscolhida = opcao.nextInt();


            switch (opcaoEscolhida) {
                case 1:
                    System.out.println(" >>>Selecionado a opção CONSULTAR SALDO <<< \n\n Seu saldo atual é de R$" + saldoConta);
                    break;
                case 2:
                    System.out.println(">>>Selecionado a opção TRANSFERIR VALOR<<< \n\n Qual valor você deseja transferir?");
                    double valorRetirado = opcao.nextDouble();
                    if (valorRetirado > saldoConta) {
                        System.out.println("Você não tem saldo suficiente para essa transação");
                    } else {
                        double saldoAtualizado = ((saldoConta) - (valorRetirado));
                        System.out.println("Valor de R$" + valorRetirado + " Transferido com sucesso! Saldo atualizado: RS$" + saldoAtualizado);
                    }
                    break;
                case 3:
                    System.out.println(">>>Selecionado a opção RECEBER VALOR<<< \n\n Qual o valor que irá receber?");
                    double valorRecebido = opcao.nextDouble();
                    double saldoAtualizado = ((saldoConta) + (valorRecebido));
                    System.out.println("Valor de R$" + valorRecebido + " recebido com sucesso! Saldo atualizado: R$" + saldoAtualizado);
                    break;
                case 4:
                    System.out.println(">>>Selecionado a opção SAIR <<< \n\n Volte sempre");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;

            }

        }


    }
}
