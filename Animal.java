 class Animal {
    void makeSound()
    {
        System.out.println(" Animal Make Sounds");
    }
 }
 class Cat extends Animal{
    void makeSound()
    {
        System.out.println("Cat Meows");
    }
 }
 class Main{
    public static void main(String [] args)
    {
        Cat obj=new Cat();
        Animal obj1=new Animal();
        obj1.makeSound();
        obj.makeSound();
    }
 }

