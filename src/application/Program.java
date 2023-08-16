package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        Champion champion1 = createChampion(scanner);

        System.out.println("\nDigite os dados do segundo campeão:");
        Champion champion2 = createChampion(scanner);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int numTurns = scanner.nextInt();

        for (int i = 1; i <= numTurns; i++) {
            System.out.println("\nResultado do turno " + i + ":");
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println(champion1.status());
            System.out.println(champion2.status());

            if (champion1.status().contains("morreu") || champion2.status().contains("morreu")) {
                System.out.println("\nFIM DO COMBATE");
                break;
            }
        }
        
    }

    public static Champion createChampion(Scanner scanner) {
        System.out.print("Nome: ");
        String name = scanner.next();
        System.out.print("Vida inicial: ");
        int life = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack = scanner.nextInt();
        System.out.print("Armadura: ");
        int armor = scanner.nextInt();

        return new Champion(name, life, attack, armor);
    }
}
