import java.util.Scanner;

public class Goods {
    private final Scanner scanner = new Scanner(System.in);
    private final Formatter format = new Formatter();
    private double price;
    StringBuilder builder = new StringBuilder();
    double sum = 0;

    void addGoods(Scanner scanner) {
        scanner.useDelimiter("\\n");
        while (true) {
            System.out.println("Введите название товара : ");
            String name = scanner.next();
            builder.append("\n").append(name);
            System.out.println("Введите стоимость товара (рубли,копейки) : ");
            checkIfDouble();
            System.out.println("Товар успешно добавлен!");
            sum = sum + price;
            System.out.println("Продолжить? Введите любой символ, чтобы продолжить или 'Завершить' для завершения.");
            System.out.printf("Текущая сумма : %.2f руб" + format.form(sum) + "\n", sum);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
    }

    private void checkIfDouble() {
        while (!scanner.hasNextDouble()) {
            printNotCorrect();
            scanner.next();
        }
        price = scanner.nextDouble();
        while (price <= 0.) {
            printNotCorrect();
            checkIfDouble();
        }
    }

    private void printNotCorrect() {
        System.out.println("Некорректная стоимость товара.");
        System.out.println("Введите стоимость товара (рубли,копейки) : ");
    }

}




