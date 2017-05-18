public class TesteContas {
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		contaCorrente.deposita(100);
		contaCorrente.saca(10);

		contaPoupanca.deposita(50);
		contaPoupanca.saca(5);

		System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

		System.out.println("Saldo da Conta Poupanca: " + contaPoupanca.getSaldo());

	}
}