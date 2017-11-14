package uade.ioo.vista.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import uade.ioo.modelo.AdministradorDePagos;

public class JFormularioPrincipal extends JFormularioBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFormularioPrincipal(AdministradorDePagos modelo) {
		super(modelo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menu = new JMenuBar();

		JMenu items = new JMenu("Formularios");
		JMenu pagos = new JMenu("Pagos");
		menu.add(items);
		pagos.add(pagos);

		JMenuItem opcRealizarPago = new JMenuItem("Realizar Pago");
		items.add(opcRealizarPago);
		opcRealizarPago.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame f = new JFormularioPago(getModelo());
				f.setVisible(true);

			}
		});
		
		
		JMenuItem opcAgregarCheque = new JMenuItem("Registrar Cheque");
		items.add(opcAgregarCheque);
		opcAgregarCheque.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame f = new JFormularioRegistrarCheque(getModelo());
				f.setVisible(true);

			}
		});

		JMenuItem opcReporte = new JMenuItem("Reporte");
		items.add(opcReporte);
		opcReporte.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFormulariorReporte(getModelo());
				f.setVisible(true);
			}
		});

		this.setJMenuBar(menu);

	}

}
