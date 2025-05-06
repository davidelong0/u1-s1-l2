import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt(); // CORRETTO: nextInt() per un numero

        String risultato = numeroIntero(numero);
        System.out.println("Il risultato è: " + risultato);

        scanner.close();
    }

    // Metodo che restituisce il numero in lettere usando switch
    public static String numeroIntero(int input) {
        switch (input) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "Errore: numero non compreso tra 0 e 3";
        }
    }
}

