package week_1;


public class Phone {
    int age;
    String type;
    String color;
    int size;

    public Phone (int age, String type, String color, int size){
        this.age = age;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String toString (){
        String call = "I'm "+ age + " my type:" + type + " color: white " + size+"sm";
        return call;
    }

}
