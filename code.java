import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mdp;
        System.out.println("Entrez le bon mot clé");
        Scanner sc = new Scanner(System.in);
        mdp = sc.nextLine();
        while (!mdp.equals("terre")) {
            System.out.println("Le mot clé est faux veuillez entrez un autre");
            mdp = sc.nextLine();
        }
        System.out.println("Le mot de passe est le bon");
    }
}
