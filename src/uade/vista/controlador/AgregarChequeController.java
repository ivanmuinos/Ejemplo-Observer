package uade.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.modelo.ChequeDeTercero;

public class AgregarChequeController implements ActionListener{
	
	private AdministradorDePagos modelo;
	private IVistaRecibirCheque vista;
	
	public AgregarChequeController(
			AdministradorDePagos modelo,
			IVistaRecibirCheque vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ChequeDeTercero c = new ChequeDeTercero(
				this.vista.getNumero(),
				this.vista.getMonto());
		
		this.modelo.registrarChequeTercero(c);
		
	}

}
