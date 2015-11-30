package week_1;


public class Cat {
    String name;
    int age;
    String kind;

    public Cat(String name, int age, String kind){
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public void sayMeow(){
        System.out.println("Meow, my name is " + name);
    }

    public String toString(){
       return String.format("Meow, my name is " + name);
    }
}
