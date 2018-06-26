package Exercicio_4;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.6;
		return super.saca(valorASacar);
	}

}
