package Lesson_8;

import Lesson_7.Person;

public class Car {
String carBrand;
String carClass;
int weight;
Driver driver;
Engine engine;

    public Car(String carBrand, String carClass, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public static void start(){
    System.out.println("Поїхали");
}
public static void stop(){
    System.out.println("Зупиняємося");
}
public static void turnRight(){
    System.out.println("Поворот праворуч");
}
public static void turnLeft(){
    System.out.println("Поворот ліворуч");
}

public void to_String(){
    System.out.println("Бренд авто " + this.carBrand + ". Клас авто " + this.carClass + ". Вага авто " + this.weight
            + ".");
    System.out.println("Ім'я водія - " + this.driver.fullname + ". Вік водія - " + this.driver.age + ". Стаж водіння - "
            + this.driver.drivingExperience + ".");

    System.out.println("Виробник двигуна - " + this.engine.company + " Потужність двигуна - " + this.engine.power + ".");
    }
}

 class Engine {
    String company;
    int power;

     public Engine(String company, int power) {
         this.company = company;
         this.power = power;
     }
 }
class Driver extends Person{
    int drivingExperience;
    String fullname;
    int age;
    public Driver (String fullname, int age, int drivingExperience){
        this.drivingExperience = drivingExperience;
        this.age = age;
        this.fullname = fullname;

    }
}

class Lorry extends Car {
    int lift;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine engine, int lift) {
        super(carBrand, carClass, weight, driver, engine);
        this.lift = lift;
    }

    @Override
    public void to_String() {
        super.to_String();
        System.out.println("Вантажопідйомність - " + lift);
    }
}
class SportCar extends Car{
    int speedLimit;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine engine, int speedLimit) {
        super(carBrand, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    public void to_String() {
        super.to_String();
        System.out.println("Speed limit - " + speedLimit );
    }
}
