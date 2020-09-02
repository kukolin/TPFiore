package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import edu.usal.controlador.BtnAltaClienteListener;
import edu.usal.controlador.BtnBorrarClienteListener;
import edu.usal.controlador.LoginControlador;
import edu.usal.controlador.MenuListener;
import edu.usal.controlador.BtnListarClienteListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class PrincipalVista extends JPanel {
	public JButton btnAltaCliente;
	public JButton btnListarClientes;
	public JButton btnBorrarClientes;

	public PrincipalVista() {
		setBackground(SystemColor.activeCaption);

		
		btnAltaCliente = new JButton("Alta Cliente");
		
		btnListarClientes = new JButton("Listar Clientes");
		
		btnBorrarClientes = new JButton("Eliminar Clientes");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(165)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBorrarClientes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnAltaCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnListarClientes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addComponent(btnAltaCliente)
					.addGap(18)
					.addComponent(btnListarClientes)
					.addGap(18)
					.addComponent(btnBorrarClientes)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void addActionListeners(BtnAltaClienteListener btnAltaClienteListener) {
		btnAltaCliente.addActionListener(btnAltaClienteListener);		
	}
	public void addActionListeners2(BtnListarClienteListener btnListarClienteListener) {
		btnListarClientes.addActionListener(btnListarClienteListener);
	}
	public void addActionListeners3(BtnBorrarClienteListener btnBorrarClienteListener) {
		btnBorrarClientes.addActionListener(btnBorrarClienteListener);
	}
}
