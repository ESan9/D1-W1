import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String name1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String name2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String name3 = scanner.nextLine();
        System.out.println(name1 + name2 + name3);
        System.out.println(name3 + name2 + name1);

    }
}
