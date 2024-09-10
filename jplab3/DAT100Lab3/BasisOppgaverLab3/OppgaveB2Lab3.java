package BasisOppgaverLab3;

import static java.lang.Math.pow;
import static javax.swing.JOptionPane.*;

public class OppgaveB2Lab3 {
    public static void main(String[] args) {
        String inputX = showInputDialog(null, "Skriv inn verdien for x (reell tall):");
        double x = Double.parseDouble(inputX);

        String inputN = showInputDialog(null, "Skriv inn verdien for n (positivt heltall):");
        int n = Integer.parseInt(inputN);

        double resultPow = Math.pow(x, n);

        double resultLoop = 1.0;
        int i = 0;
        while (i < n) {
            resultLoop *= x;
            i++;
        }

        String message = String.format(
                "Pow: x^n = %.4f\n" +
                        "While-løkke: x^n = %.4f", resultPow, resultLoop
        );

        showMessageDialog(null, message);
    }
}
