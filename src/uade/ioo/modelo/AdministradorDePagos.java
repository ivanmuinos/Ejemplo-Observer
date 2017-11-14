package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

import uade.ioo.observer.Observado;

public class AdministradorDePagos extends Observado {
	private List<Cheque> cheques = new ArrayList<Cheque>();
	
	
	//método para registrar cheques de terceros
	public void registrarChequeTercero(ChequeDeTercero cheque){
		this.cheques.add(cheque);
		this.notificarObservadores();
	}
	
	public double getMontoTotalCheques(){
		double result = 0;
		
		for(Cheque c: this.cheques){
			result += c.getMonto();
		}
		
		return result;
	}
}


