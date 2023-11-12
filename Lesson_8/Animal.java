package Lesson_8;

public class Animal {
    String name;
    public void makeNoise (){}
    public void eat (){}
    public void getDescription (){}

}
class Wild_Animal extends Animal{}
class Home_Animal extends Animal{}

class Cat extends Animal{

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow, meow!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I like to eat MEAT and MILK!");
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("My name is " + Cat.super.name);
    }
}
class Dog extends Animal{

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Woof, woof!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I like to eat MEAT and Grill!");
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("My name is " + Dog.super.name);
    }
}
class Bear extends Animal{
    public Bear (String name) {
        this.name = name;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Hello, I am not good bear. I`ll eat yoy!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I like to eat HONEY!");
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("My name is " + Bear.super.name);
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.name + " has a cold. It has appointment with a doctor");
    }
}


