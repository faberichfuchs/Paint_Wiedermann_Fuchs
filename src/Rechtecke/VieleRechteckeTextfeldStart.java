package Rechtecke;
import javax.swing.JFrame;

/**
 * Hier wird das JFrame erstellt auf dem die Komponenten hinzugef�gt werden
 * @author Fabio Fuchs
 * @version 2017-05-09
 *  
 */

public class VieleRechteckeTextfeldStart {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Viele Rechtecke");
		VieleRechteckeTextfeldPanel textfeld = new VieleRechteckeTextfeldPanel();
		frame.add(textfeld);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}	
}