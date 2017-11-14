package uade.ioo.vista.formularios;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorDePagos;
import uade.vista.controlador.AgregarChequeController;

public class JFormularioRegistrarCheque extends JFormularioBase implements IVistaRecibirCheque {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtMonto = new JTextField();
	private JTextField txtNumero = new JTextField();
	private JButton btnAgregarCheque = new JButton("Registrar");

	public JFormularioRegistrarCheque(AdministradorDePagos modelo) {
		super(modelo);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		this.getContentPane().add(new JLabel("Numero: "));
		this.getContentPane().add(txtNumero);
		this.getContentPane().add(new JLabel("Monto: "));
		this.getContentPane().add(txtMonto);
		this.getContentPane().add(btnAgregarCheque);
		
		this.btnAgregarCheque.addActionListener(
				new AgregarChequeController(
						this.getModelo(),
						this
						));
		
		btnAgregarCheque.setMaximumSize(getMaximumSize());

}
	
	public int getNumero(){
		return Integer.parseInt(this.txtNumero.getText());
	}
	
	public double getMonto(){
		return Double.parseDouble(this.txtMonto.getText());
	}
}
