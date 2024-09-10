package ObligatoriskeOppgaverLab3;
import static javax.swing.JOptionPane.*;

public class OppgaveO2Lab3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int grade = -1;
            while (grade < 0 || grade > 100) {
                String inputUser = showInputDialog("Skriv inn poengsummen for student " + i + ": ");
                grade = Integer.parseInt(inputUser);

                if (grade < 0 || grade > 100) {
                    showMessageDialog(null, "Ugyldig poengsum for student " + i + ". Prøv igjen.");
                }
            }

            if (grade >= 90 && grade <= 100) {
                showMessageDialog(null, "Student " + i + " Karakter: A");
            }
            else if (grade >= 80 && grade <= 89) {
                showMessageDialog(null, "Student " + i + " Karakter: B");
            }
            else if (grade >= 60 && grade <= 79) {
                showMessageDialog(null, "Student " + i + " Karakter: C");
            }
            else if (grade >= 50 && grade <= 59) {
                showMessageDialog(null, "Student " + i + " Karakter: D");
            }
            else if (grade >= 40 && grade <= 49) {
                showMessageDialog(null, "Student " + i + " Karakter: E");
            }
            else {
                showMessageDialog(null, "Student " + i + " Karakter: F");
            }
        }
    }
}
