public class Formatter {
Calculator calc = new Calculator();
Goods goods = new Goods();
Main main = new Main();
double check = calc.sumPerPerson(goods.sum, main.persons);

void form(double check){
    if(Math.floor(check) > 20 && Math.floor(check)%10==1){
        System.out.println(String.format("С каждого человека по : %.2f рубль.", check));
    }
    else if (Math.floor(check) > 20 && Math.floor(check)%10 < 5 && Math.floor(check)%10 > 0){
        System.out.println(String.format("С каждого человека по : %.2f рубля.", check));
    }
    else{
        System.out.println(String.format("С каждого человека по : %.2f рублей.", check));
    }
}
}
