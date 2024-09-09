package GrunnleggendeOppgaverLab3;

public class OppgaveG3Lab3 {
    public static void main(String[] args) {
        System.out.println("Oppgave G3 a + b)");

        for (int i = 1; i <= 20; i++) {
            System.out.println("i = " + i);


            switch (i){
                case 1: System.out.println("A"); break;
                case 2: System.out.println("B"); break;
                default:System.out.println("C"); break;
            }
        }


        System.out.println("Oppgave G3 c)");
        for (int i = 1; i <= 20; i++) {
            System.out.println("i = " + i);

            if (i == 1){
                System.out.println("A");
            }
            else if (i == 2){
                System.out.println("B");
            }
            else {
                System.out.println("C");
            }
        }


    }
}
