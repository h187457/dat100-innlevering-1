package BasisOppgaverLab3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB1Lab3 {
    public static void main(String[] args) {
        String oddNedre = showInputDialog(null, "Nedre grense: ");
        int oddIntNedre = Integer.parseInt(oddNedre);

        String oddOvre = showInputDialog(null, "Øvre grense: ");
        int oddIntOvre = Integer.parseInt(oddOvre);

        // Opprett en strengvariabel for å lagre de odde tallene
        String oddNumbers = "";

        for (int i = oddIntNedre; i <= oddIntOvre; i++) {
            if (i % 2 != 0) {  // Sjekker om tallet er odde
                // Legger til det oddetallet i strengen
                oddNumbers += i + " ";
            }
        }

        // Viser de odde tallene i en meldingsboks
        showMessageDialog(null, "Oddetall mellom " + oddIntNedre + " og " + oddIntOvre + ": " + oddNumbers);
    }
}
