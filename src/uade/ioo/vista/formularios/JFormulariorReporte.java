package uade.ioo.vista.formularios;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import uade.ioo.modelo.AdministradorDePagos;

public class JFormulariorReporte extends JFormularioBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMontoTotal = new JLabel("0"); 
	
	public JFormulariorReporte(AdministradorDePagos modelo) {
		super(modelo);
		this.setLayout(new FlowLayout());
		this.getContentPane().add(new JLabel("Monto Total: "));
		this.getContentPane().add(lblMontoTotal);
	}
	@Override
	public void actualizar() {
		super.actualizar();
		this.lblMontoTotal.setText(
				Double.toString(this.getModelo().getMontoTotalCheques()));
		
	}
}
