// package Non-Primitive DataTypes;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class interfacetype {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
