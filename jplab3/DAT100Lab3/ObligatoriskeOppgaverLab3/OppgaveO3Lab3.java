package ObligatoriskeOppgaverLab3;
import static javax.swing.JOptionPane.*;

public class OppgaveO3Lab3 {
    public static void main(String[] args) {

        String heltall = showInputDialog("Tast inn et heltall: ");
        int n = Integer.parseInt(heltall);

        int sum = 1;

        if (n != 0){
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            showMessageDialog(null, "Fakultetet av " + n + " er: " + sum);
        }
        else {
            showMessageDialog(null, "Ugyldig input");
        }



    }
}
