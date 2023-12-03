public class Formatter {

    String form(double check) {
        int rounded = (int) Math.floor(check);
        int balance = (int) (Math.floor(check) % 10);
        if (rounded == 1 || (rounded > 20 && balance == 1)) {
            return "ль";
        } else if ((rounded < 5 && rounded > 0) || (rounded > 20 && balance < 5 && balance > 0)) {
            return "ля";
        } else {
            return "лей";
        }
    }
}
