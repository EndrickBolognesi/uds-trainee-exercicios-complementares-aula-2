package Exercicio_4;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(0001, 0000001);
        contaCorrente.deposita(200);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.saca(60);


        ContaPoupanca contaPoupanca = new ContaPoupanca(0002, 0000002);
        contaPoupanca.deposita(100);
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.saca(2);

        System.out.println("Primeira conta tem " + contaCorrente.getSaldo() + "D$ Dols");
        System.out.println("Segunda conta tem " + contaPoupanca.getSaldo() + "D$ Dols");

        System.out.println("Parabains seu banco tem " + Conta.getTotal() + " contas abertas!!!");
    }

}