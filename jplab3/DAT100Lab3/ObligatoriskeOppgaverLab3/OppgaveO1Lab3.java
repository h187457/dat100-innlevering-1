package ObligatoriskeOppgaverLab3;

import static javax.swing.JOptionPane.*;

public class OppgaveO1Lab3 {
    public static void main(String[] args) {
        String bruttInp = showInputDialog("Bruttoinntekt: ");
        double bruttDouble = Double.parseDouble(bruttInp);

        double trinnskatt = 0;

        if (bruttDouble > 208050) {
            if (bruttDouble <= 292850) {
                trinnskatt += (bruttDouble - 208050) * 0.017;
            } else {
                trinnskatt += (292850 - 208050) * 0.017;
            }

            if (bruttDouble > 292850 && bruttDouble <= 670000) {
                trinnskatt += (bruttDouble - 292850) * 0.04;
            } else if (bruttDouble > 670000) {
                trinnskatt += (670000 - 292850) * 0.04;
            }

            if (bruttDouble > 670000 && bruttDouble <= 937900) {
                trinnskatt += (bruttDouble - 670000) * 0.136;
            } else if (bruttDouble > 937900) {
                trinnskatt += (937900 - 670000) * 0.136;
            }

            if (bruttDouble > 937900 && bruttDouble <= 1350000) {
                trinnskatt += (bruttDouble - 937900) * 0.166;
            } else if (bruttDouble > 1350000) {
                trinnskatt += (1350000 - 937900) * 0.166;
            }

            if (bruttDouble > 1350000) {
                trinnskatt += (bruttDouble - 1350000) * 0.176;
            }
        }

        // Vis resultatet
        showMessageDialog(null, "Trinnskatt: " + String.format("%.2f", trinnskatt));
    }
}
