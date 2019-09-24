import java.awt.Dimension;

import javax.swing.JFrame;


public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Ventana() {
		this.setTitle("He cambiado el titulo de la ventana");
		this.setSize(640, 540);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v = new Ventana();
		System.out.println("No me gusta este mensaje");
		
	}

}
