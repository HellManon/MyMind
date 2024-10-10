import Mastermind.Mastermind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome into my mind");
        //insertion boucle pour le menu
        boolean keepPlaying = true;
        while (keepPlaying) {

            System.out.println("choisisser un jeu");
            System.out.println("1 Mastermind");
            System.out.println("2 Puissance 4");
            System.out.println("3 Tetris");

            //selection du jeu
            Scanner c = new Scanner(System.in);
            int choice = c.nextInt();

            switch (choice) {
                case 1:
                    //ajout du jeu 2
                    Mastermind mastermind = new Mastermind();
                    mastermind.start();
                    break;
                case 2:
                    //ajout du jeu 2
                    System.out.println("Puissance 4");
                    break;
                case 3:
                    //ajout du jeu 2
                    System.out.println("Tetris");
                    break;
                default:
                    System.out.println("choix inconnu");
                    break;
            }

            // Demande si l'utilisateur souhaite jouer à nouveau
            System.out.println("Voulez-vous changer de jeu ? (oui/non)");
            Scanner r = new Scanner(System.in);
            String response = r.next();
            keepPlaying = response.equalsIgnoreCase("oui");

        }
        System.out.println("Merci d'avoir joué !");
    }
}