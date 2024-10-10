import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome into my mind");
        System.out.println("choisisser un jeu");
        System.out.println("choix 1");
        System.out.println("choix 2");

        //selection du jeu
        Scanner c = new Scanner(System.in);
        int choice = c.nextInt();

            switch (choice){
                case 1 :
                    //ajout du jeu 2
                    System.out.println("jeu 1");
                    break;
                case 2 :
                    //ajout du jeu 2
                    System.out.println("jeu 2");
                    break;
                default:
                    System.out.println("choix inconnu");
                    break;
            }

    }
}