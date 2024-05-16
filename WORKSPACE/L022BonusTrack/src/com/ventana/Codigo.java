package com.ventana;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Codigo {

	
	public static void main(String[] args) {
		JFrame miVentana = new JFrame("El titulo va aqui");
		Dimension dim = new Dimension(500,200);
		miVentana.setPreferredSize(dim);
		miVentana.setSize(dim);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.getContentPane().setLayout(new FlowLayout());
		
		JTextField campoTexto = new JTextField(5);
		miVentana.getContentPane().add(campoTexto);
		
		JButton miBoton = new JButton("Guardar");
		miVentana.getContentPane().add(miBoton);
		miVentana.setVisible(true);
	}
	
	
}
