package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgB4 {
	
public static void main(String[] args) {
		
		String bruttol�nn = showInputDialog("Skriv inn bruttol�nn:");
		int l�nn = Integer.parseInt(bruttol�nn);
		
		double trinn0 = 0;
		double trinn1 = 0.017;
		double trinn2 = 0.040;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		
		
		if (l�nn >=0 && l�nn <= 184800) {
		    showMessageDialog(null, "Trinnskatt " + l�nn * trinn0);
		}
		else if (l�nn >= 184001 && l�nn <=260100) {
			showMessageDialog (null, "Trinnskatt " + l�nn * trinn1);
		}
		else if (l�nn >= 260101 && l�nn <= 651250) {
			showMessageDialog (null, "Trinnskatt " + l�nn * trinn2);
		}
		else if (l�nn >= 651251 && l�nn <=1021550) {
			showMessageDialog (null, "Trinnskatt " + l�nn * trinn3);
		}
		else if (l�nn >= 1021550) {
			showMessageDialog (null, "Trinnskatt " + l�nn * trinn4);
		}
		
	}
}
