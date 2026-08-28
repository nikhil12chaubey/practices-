class Animal {
    public void play() {
        System.out.println("Animal is playing");
    }

    public void sounds() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public void sounds() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    public void sounds() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.play();
        dog.sounds();

        Animal cat = new Cat();
        cat.play();
        cat.sounds();
    }
}