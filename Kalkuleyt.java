import java.util.Scanner;

public class Kalkuleyt {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.print("1-sonni kiriting: ");
        double son1 = scanner.nextDouble();

        System.out.print("Bajarmoqchi bo'lgan amalingizni kirting (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("Bunday amal yo/'q boshqatdan kirting");
        }

        System.out.print("2-sonni kiriting: ");
        double son2 = scanner.nextDouble();
        double natija;

        switch (operator) {
            case '+':
                natija = son1 + son2;
                break;
            case '-':
                natija = son1 - son2;
                break;
            case '*':
                natija = son1 * son2;
                break;
            case '/':
                if (son2 != 0)
                    natija = son1 / son2;
                else {
                    System.out.println("0 ga bo‘lish mumkin emas!");
                    return;
                }
                break;
            default:
                System.out.println("Noto‘g‘ri amal!");
                return;
        }
        System.out.println("Natija: " + natija);
    }
}



