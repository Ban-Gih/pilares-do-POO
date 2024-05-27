package pilaresDoPoo;

public class Carro extends Veiculo {
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em p");
	}
}
