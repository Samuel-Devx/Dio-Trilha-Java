
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Variável obrigatórias:
        double saldo = 237.48;
        Scanner teclado = new Scanner (System.in);
        //Pergunta para usuario:
        System.out.print(" Olá deseja criar uma conta em nosso banco? (y/n)");
        String resposta = teclado.next();
        //condicional
        if (resposta.equalsIgnoreCase("y")) {
            //scanner para entrada de dados 
            System.out.print(" Digite seu nome: ");
            String nome = teclado.next();
            System.out.print(nome + " digite o número da agencia:  (ex:067-08)  ");
            String agencia = teclado.next();
            System.out.print(nome + " digite o número da conta:  (ex:1021)   ");
            int numeroDaConta = teclado.nextInt();

            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numeroDaConta, saldo));
        }
        //saiar da aplicação
        else {
            System.out.println("Saindo....");
        }






         
    }
}
