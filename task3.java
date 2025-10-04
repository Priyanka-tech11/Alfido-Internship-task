class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal("Generic Animal");
        a1.display();
        a1.makeSound();

        System.out.println();

        Dog d1 = new Dog("Buddy");
        d1.display();
        d1.makeSound();
        d1.fetch();
    }
}


