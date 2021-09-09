package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgB4 {
	
public static void main(String[] args) {
		
		String bruttolønn = showInputDialog("Skriv inn bruttolønn:");
		int lønn = Integer.parseInt(bruttolønn);
		
		double trinn0 = 0;
		double trinn1 = 0.017;
		double trinn2 = 0.040;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		
		
		if (lønn >=0 && lønn <= 184800) {
		    showMessageDialog(null, "Trinnskatt " + lønn * trinn0);
		}
		else if (lønn >= 184001 && lønn <=260100) {
			showMessageDialog (null, "Trinnskatt " + lønn * trinn1);
		}
		else if (lønn >= 260101 && lønn <= 651250) {
			showMessageDialog (null, "Trinnskatt " + lønn * trinn2);
		}
		else if (lønn >= 651251 && lønn <=1021550) {
			showMessageDialog (null, "Trinnskatt " + lønn * trinn3);
		}
		else if (lønn >= 1021550) {
			showMessageDialog (null, "Trinnskatt " + lønn * trinn4);
		}
		
	}
}
