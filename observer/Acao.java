import java.util.*;

public class Acao {
	private String codigo;
	private double valor;
	private List<AcaoObserver> interessados = new ArrayList<AcaoObserver>();

	public Acao(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public void registraInteressado(AcaoObserver interessado) {
		this.interessados.add(interessado);
	}

	public void cancelaInteresse(AcaoObserver interessado) {
		this.interessados.remove(interessado);
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		for(AcaoObserver interessado : this.interessados) {
			interessado.notificaAlteracao(this);
		}
	}

	public String getCodigo() {
		return codigo;
	}
}