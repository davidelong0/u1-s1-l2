import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String parola = scanner.nextLine();
        boolean risultato = stringaPariDispari(parola);
        System.out.println("Il numero di caratteri è pari? " + risultato);

        System.out.println("Inserisci un anno: ");
        int anno = scanner.nextInt();
        boolean risultato2 = annoBisestile(anno);
        System.out.println("L'anno è bisestile? " + risultato2);

        scanner.close();
    }

    // Metodo per vedere se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String input) {
        return input.length() % 2 == 0;
    }

    // Metodo per verificare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

