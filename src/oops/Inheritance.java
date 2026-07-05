package oops;

class Animal {

    void sound() {
        System.out.print("Aniaal make sound");
    }
}

class Dog extends Animal {

}

public class Inheritance {

    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
    }
}
