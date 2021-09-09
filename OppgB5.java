package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgB5 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
		
		String poengsum = showInputDialog("Skriv inn din poengsum:");
		int sum = parseInt(poengsum);
		
		char feilmelding = '!';
		char karakterA = 'A';
		char karakterB = 'B';
		char karakterC = 'C';
		char karakterD = 'D';
		char karakterE = 'E';
		char karakterF = 'F';
		
		if (sum >=101) {
			showMessageDialog(null, "Feilmelding" + feilmelding);
			i--;
		}
		
		else if (sum >=90 && sum <=100) {
			showMessageDialog(null, "Du fikk karakter" + karakterA);
		}
		
		else if (sum >= 80 && sum <= 89) {
			showMessageDialog(null, "Du fikk karakter" + karakterB);
		}
		
		else if (sum >=60 && sum <=79) {
			showMessageDialog(null, "Du fikk karakter" + karakterC);
		}
		
		else if (sum >=50 && sum <=59) {
			showMessageDialog(null, "Du fikk karakter" + karakterD);
		}
		
		else if (sum >=40 && sum <=49) {
			showMessageDialog(null, "Du fikk karakter" + karakterE);
		}
		
		else if (sum >=0 && sum <=39) {
			showMessageDialog(null, "Du fikk karakter" + karakterF);
		}
		
		else if (sum < 0) {
		    showMessageDialog(null, "feilmelding" + feilmelding);
		    i--;
		}
		}
	}
}
