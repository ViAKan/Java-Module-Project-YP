import java.util.Scanner;

public class Main {
    private static int persons;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Goods goods = new Goods();
        Calculator calc = new Calculator();
        Formatter format = new Formatter();
        while (true) {
            System.out.println("Введите количество человек : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некорректное число или символ. Попробуйте заново.");
                System.out.println("Введите количество человек : ");
                scanner.next();
            }
            int amountOfPeople = scanner.nextInt();
            if (amountOfPeople <= 1) {
                System.out.println("Некорректное число человек. Попробуйте снова.");
            } else {
                System.out.println("Отлично! Делим счет на " + amountOfPeople + "-х!");
                persons = amountOfPeople;
                break;
            }
        }
        goods.addGoods(scanner);
        System.out.println("Добавленные товары : " + "\n" + goods.builder + "\n");
        System.out.printf("С каждого человека по : %.2f руб" + format.form(calc.sumPerPerson(goods.sum, persons)), calc.sumPerPerson(goods.sum, persons));
    }
}