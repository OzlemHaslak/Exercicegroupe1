package Varargs;

public class Dog extends Mammal {

    public boolean bark = true;

    public static void main(String[] args) {

        Animal dog = new Dog();

        System.out.println(((Dog) dog).bark);

        System.out.println(((Dog) dog).feed);

        System.out.println(dog.weight);

    }

}