package lab_task1;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class poly {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.5));

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}
