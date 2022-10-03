import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        int a = scanner.nextInt();
        System.out.print("Informe a segunda nota: ");
        int b = scanner.nextInt();
        System.out.print("Informe a terceira nota: ");
        int c = scanner.nextInt();
        System.out.print("Informe a quarta nota: ");
        int d = scanner.nextInt();
        scanner.close();

        int e = (a + b + c + d) / 4;

        System.out.print("A média das notas será: " + e);

    }
}