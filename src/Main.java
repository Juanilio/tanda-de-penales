import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int tiro;
        int parada;
        int puntaje_jugador = 0;
        int puntaje_maquina = 0;
        final int TOTAL_TURNOS = 5;
        int turno = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════╗");
        System.out.println("║   TANDA DE PENALES       ║");
        System.out.println("╚══════════════════════════╝");

        do {
            System.out.println("\n=== TURNO " + turno + " de " + TOTAL_TURNOS + " ===");
            System.out.println("+-------+");
            System.out.println("| 1 2 3 |");
            System.out.println("| 4 5 6 |");
            System.out.println("| 7 8 9 |");
            System.out.println("+-------+");

            System.out.println("\n-- Tú pateas --");

            do {
                System.out.print("¿A qué zona vas a patear? (1-9): ");
                tiro = sc.nextInt();
                if (tiro < 1 || tiro > 9) {
                    System.out.println("⚠ Zona inválida. Elige entre 1 y 9.");
                }
            } while (tiro < 1 || tiro > 9);

            parada = ThreadLocalRandom.current().nextInt(1, 10);

            if (tiro == parada) {
                System.out.println("ATAJADO! El portero se tiró a la zona " + parada);
            } else {
                System.out.println("¡GOOOOOOOOOOOL! Pateaste a la zona " + tiro);
                puntaje_jugador++;
            }

            System.out.println("-- La máquina patea --");

            do {
                System.out.print("¿A qué zona vas a tirarte como arquero? (1-9): ");
                parada = sc.nextInt();
                if (parada < 1 || parada > 9) {
                    System.out.println("Zona inválida. Elige entre 1 y 9.");
                }
            } while (parada < 1 || parada > 9);

            tiro = ThreadLocalRandom.current().nextInt(1, 10);

            if (tiro == parada) {
                System.out.println("¡ATAJADO! Adivinaste la zona " + tiro);
            } else {
                System.out.println("¡GOOOOOOOOOOOL! La máquina pateó a la zona " + tiro);
                puntaje_maquina++;
            }

            System.out.println("Marcador -> Tú: " + puntaje_jugador + " | Máquina: " + puntaje_maquina);
            turno++;

        } while (turno <= TOTAL_TURNOS);

        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║     RESULTADO FINAL      ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("Tú: " + puntaje_jugador + " | Máquina: " + puntaje_maquina);

        if (puntaje_jugador > puntaje_maquina) {
            System.out.println("¡GANASTE LA TANDA DE PENALES!");
        } else if (puntaje_maquina > puntaje_jugador) {
            System.out.println("¡La máquina ganó la tanda de penales!");
        } else {
            System.out.println("¡EMPATE!");
        }

        sc.close();
    }
}