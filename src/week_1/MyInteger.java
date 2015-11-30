package week_1;

public class MyInteger {
    int number;

    public MyInteger(int number){
        this.number = number;
    }

    public int add(int num){
       int sum = num + number;
       return sum;
    }
}
