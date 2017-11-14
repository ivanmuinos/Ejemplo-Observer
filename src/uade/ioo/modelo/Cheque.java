package uade.ioo.modelo;

public abstract class Cheque {
	private int numero;
	private double monto;
	
	public Cheque(int numero, double monto) {
		super();
		this.numero = numero;
		this.monto = monto;
	}

	public int getNumero() {
		return numero;
	}

	public double getMonto() {
		return monto;
	}
	
}
