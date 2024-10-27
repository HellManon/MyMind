package Mastermind;

import java.util.Scanner;
import java.util.Random;

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
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] colors = {"R", "B", "V", "J", "O", "G"};  // Initiales des couleurs
        String[] secretCode = new String[5];  // Tableau pour stocker le code secret (longueur 5)

        // Générer une combinaison aléatoire
        for (int i = 0; i < 5; i++) {
            secretCode[i] = colors[rand.nextInt(colors.length)];
        }

        System.out.println("Bienvenue dans le Mastermind (version classique avec des couleurs) !");
        System.out.println("Essayez de deviner la combinaison de 5 couleurs.");
        System.out.println("Couleurs disponibles : R (Rouge), B (Bleu), V (Vert), J (Jaune), O (Orange), G (Gris)");
        System.out.println("I pour bonne couleur, mauvaise position");
        System.out.println("O pour bonne couleur");
        System.out.println("X pour mauvaise couleur");
        System.out.println("Entrez 5 couleurs séparées par des espaces (ex: R B J O G) :");
        boolean won = false;
        int attempts = 12;

        // Boucle principale du jeu
        while (!won && attempts > 0) {
            //System.out.println("Tentative restante : " + attempts);
            attempts--;

            String[] playerGuess = scanner.nextLine().toUpperCase().split(" ");

            // Vérifier que le joueur entre bien 5 couleurs
            if (playerGuess.length != 5) {
                System.out.println("Vous devez entrer exactement 5 couleurs.");
                continue;
            }

            // Initialisation du résultat pour cette tentative
            String[] feedback = new String[5];
            boolean[] codeMatched = new boolean[5];  // Indicateur pour marquer les cases du code déjà évaluées
            int correctPosition = 0;

            // Première boucle : vérification des couleurs exactes (bien placées)
            for (int i = 0; i < 5; i++) {
                if (playerGuess[i].equals(secretCode[i])) {
                    feedback[i] = "O";  // "O" pour bien placé
                    codeMatched[i] = true;
                    correctPosition++;
                } else {
                    feedback[i] = "X";  // "X" initialement pour mal placé
                }
            }

            // Deuxième boucle : vérification des bonnes couleurs mais mal placées
            for (int i = 0; i < 5; i++) {
                if (feedback[i].equals("X")) {  // Si la couleur n'est pas bien placée
                    for (int j = 0; j < 5; j++) {
                        if (!codeMatched[j] && playerGuess[i].equals(secretCode[j])) {
                            feedback[i] = "I";  // "I" pour bonne couleur, mauvaise position
                            codeMatched[j] = true;
                            break;
                        }
                    }
                }
            }

            // Afficher le feedback pour cette tentative
            System.out.print("Résultat pour la tentative : ");
            for (String color : playerGuess) {
                System.out.print("[" + color + "]");
            }
            System.out.print(" <|> ");
            for (String result : feedback) {
                System.out.print("[" + result + "]");
            }
            System.out.println(" | Tentative restante : " + attempts);
            System.out.println();

            // Condition de victoire
            if (correctPosition == 5) {
                won = true;
                System.out.println("Félicitations ! Vous avez trouvé la combinaison secrète.");
            } else if (attempts == 0) {
                System.out.println("Désolé, vous avez épuisé toutes vos tentatives. La combinaison secrète était : ");
                for (String color : secretCode) {
                    System.out.print("[" + color + "]");
                }
                System.out.println();
            }
        }

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

