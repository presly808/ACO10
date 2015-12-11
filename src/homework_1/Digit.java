package homework_1;

public class Digit {
    int number;

    public Digit(int number) {
        this.number = number;
    }

    public Digit sum(Digit digit) {
        int sum = digit + number;
        return new Digit(sum);
    }

    public int dif(int digit) {
        int dif = digit - number;
        return dif;
    }

    public int mult(int digit) {
        int mult = digit * number;
        return mult;
    }

    public int diff(int digit) {
        int diff = digit / number;
        return diff;
    }

    public double inv(int digit) {
        double inv = Math.pow(digit, number);
        return inv;
    }

    public int fact(int digit) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int rem(int digit) {
        int rem = digit % number;
        return rem;
    }

    public int comp(int digit) {

        if (digit > number) {
            return digit;
        }

        if (number > digit) {
            return number;
        } else return 0;
    }


}
