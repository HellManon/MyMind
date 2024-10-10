package Mastermind;

import java.util.Scanner;

public class Mastermind {

    public void start() {

        System.out.println("bienvenue dans Mastermind");
        //selection du mode
        //insertion boucle pour le menu
        boolean keepPlaying = true;
        while (keepPlaying) {

            System.out.println("Choisissez un mode de jeu :");
            System.out.println("1 - Jeu classique (couleurs)");
            System.out.println("2 - Jeu avec couleurs (longueur personnalisée)");
            System.out.println("3 - Jeu classique (chiffres)");
            System.out.println("4 - Jeu chiffres (longueur personnalisée)");
            System.out.println("5 - Jeu classique (lettres)");
            System.out.println("6 - Jeu lettres (longueur personnalisée)");
            System.out.println("7 - Version spéciale (chiffres et lettres)");
            System.out.println("8 - Version chiffres et lettres (longueur personnalisée)");

            Scanner scanner = new Scanner(System.in);
            int mode = scanner.nextInt();

            switch (mode) {
                case 1:
                    // Lancer le jeu classique avec couleurs
                    playClassicColors();
                    break;
                case 2:
                    // Lancer le jeu avec couleurs et longueur personnalisée
                    playCustomLengthColors();
                    break;
                case 3:
                    // Lancer le jeu classique avec chiffres
                    playClassicNumbers();
                    break;
                case 4:
                    // Lancer le jeu chiffres avec longueur personnalisée
                    playCustomLengthNumbers();
                    break;
                case 5:
                    // Lancer le jeu classique avec lettres
                    playClassicLetters();
                    break;
                case 6:
                    // Lancer le jeu lettres avec longueur personnalisée
                    playCustomLengthLetters();
                    break;
                case 7:
                    // Lancer la version spéciale avec chiffres et lettres
                    playSpecialVersion();
                    break;
                case 8:
                    // Lancer la version chiffres et lettres avec longueur personnalisée
                    playCustomLengthNumbersAndLetters();
                    break;
                default:
                    System.out.println("Choix inconnu");
                    break;
            }
            // Demande si l'utilisateur souhaite changer de mode
            System.out.println("Voulez-vous changer de mode de jeu ? (oui/non)");
            Scanner r = new Scanner(System.in);
            String response = r.next();
            keepPlaying = response.equalsIgnoreCase("oui");
        }
    }

    private void playClassicColors() {
        // Logique du jeu classique avec couleurs
        System.out.println("Vous jouez au jeu classique avec couleurs !");
        // Ajoute la logique de jeu ici...
    }

    private void playCustomLengthColors() {
        // Logique du jeu avec couleurs et longueur personnalisée
        System.out.println("Vous jouez au jeu avec couleurs et longueur personnalisée !");
        // Ajoute la logique de jeu ici...
    }

    private void playClassicNumbers() {
        // Logique du jeu classique avec chiffres
        System.out.println("Vous jouez au jeu classique avec chiffres !");
        // Ajoute la logique de jeu ici...
    }

    private void playCustomLengthNumbers() {
        // Logique du jeu chiffres avec longueur personnalisée
        System.out.println("Vous jouez au jeu chiffres avec longueur personnalisée !");
        // Ajoute la logique de jeu ici...
    }

    private void playClassicLetters() {
        // Logique du jeu classique avec lettres
        System.out.println("Vous jouez au jeu classique avec lettres !");
        // Ajoute la logique de jeu ici...
    }

    private void playCustomLengthLetters() {
        // Logique du jeu lettres avec longueur personnalisée
        System.out.println("Vous jouez au jeu lettres avec longueur personnalisée !");
        // Ajoute la logique de jeu ici...
    }

    private void playSpecialVersion() {
        // Logique de la version spéciale avec chiffres et lettres
        System.out.println("Vous jouez à la version spéciale avec chiffres et lettres !");
        // Ajoute la logique de jeu ici...
    }

    private void playCustomLengthNumbersAndLetters() {
        // Logique de la version chiffres et lettres avec longueur personnalisée
        System.out.println("Vous jouez à la version chiffres et lettres avec longueur personnalisée !");
        // Ajoute la logique de jeu ici...
    }


}

