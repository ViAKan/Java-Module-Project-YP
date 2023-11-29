import java.util.Scanner;

public class Goods {
    Scanner scanner = new Scanner(System.in);
    String name;
    String Name = "";
    double price;
    double sum = 0;

    void AddGoods(Scanner scanner) {
        while (true) {
            System.out.println("Введите название товара : ");
            name = scanner.next();
            Name = Name + "\n" + name;
            System.out.println("Введите стоимость товара (рубли,копейки) : ");
            IsDouble();
            while(price <= 0.){
                System.out.println("Некорректная стоимость товара.");
                System.out.println("Введите стоимость товара (рубли,копейки) : ");
                IsDouble();
            }
            System.out.println("Товар успешно добавлен!");
            sum = sum + price;
            System.out.println("Продолжить? Введите любой символ, чтобы продолжить или 'Завершить' для завершения.");
            System.out.println(String.format("Текущая сумма : %.2f руб" + ending(sum), sum));
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
    }
    void IsDouble () {
        while (!scanner.hasNextDouble()) {
            System.out.println("Некорректная стоимость товара.");
            System.out.println("Введите стоимость товара (рубли,копейки) : ");
            scanner.next();
        }
        price = scanner.nextDouble();
    }
    String ending(double sum){
        if(Math.floor(sum) > 20 && Math.floor(sum)%10==1){
            return "ль";
        }
        else if (Math.floor(sum) > 20 && Math.floor(sum)%10 < 5 && Math.floor(sum)%10 > 0){
            return "ля";
        }
        return "лей";
    }

}




