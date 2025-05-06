import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        parolaInserita(scanner);
        scanner.close();
    }

    public static void parolaInserita(Scanner scanner) {
        String parola = "";

        while (!parola.equals(":q")) {
            System.out.println("Inserisci una parola:");
            parola = scanner.nextLine();

            if (!parola.equals(":q")) {

                for (int i = 0; i < parola.length(); i++) {
                    System.out.print(parola.charAt(i));
                    if (i < parola.length() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
}

