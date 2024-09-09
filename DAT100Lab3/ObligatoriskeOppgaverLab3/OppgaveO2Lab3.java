package ObligatoriskeOppgaverLab3;
import static javax.swing.JOptionPane.*;

public class OppgaveO2Lab3 {
    public static void main(String[] args) {
        String inputUser = showInputDialog("Enter your grade: ");
        int grade = Integer.parseInt(inputUser);

        if (grade >= 90 && grade <= 100) {
            showMessageDialog(null, "Grade: A");
        }
        else if (grade >= 80 && grade <= 89) {
            showMessageDialog(null, "Grade: B");
        }
        else if (grade >= 60 && grade <= 79) {
            showMessageDialog(null, "Grade: C");
        }
        else if (grade >= 50 && grade <= 59) {
            showMessageDialog(null, "Grade: D");
        }
        else if (grade >= 40 && grade <= 49) {
            showMessageDialog(null, "Grade: E");
        }
        else if (grade >= 0 && grade <= 39) {
            showMessageDialog(null, "Grade: F");
        }
        else{
            showMessageDialog(null, "Wrong input");
        }
    }
}
