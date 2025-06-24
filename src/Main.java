import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.print("Inserisci il numero di parole: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inserisci " + N + " parole:");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (paroleDistinte.contains(parola)) {
                paroleDuplicate.add(parola);
            } else {
                paroleDistinte.add(parola);
            }
        }

        System.out.println("Parole duplicate:");
        if (paroleDuplicate.isEmpty()) {
            System.out.println("Nessuna parola duplicata.");
        } else {
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
        }

        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        System.out.println("parole distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}