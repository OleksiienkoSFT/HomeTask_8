package Lesson_8;

public class Main {
    public static void main(String[] args) {
        Home_Animal cow = new Home_Animal();
        Home_Animal bull = new Home_Animal();
        Home_Animal sheep = new Home_Animal();
        Home_Animal donkey = new Home_Animal();
        Home_Animal goat = new Home_Animal();
        Home_Animal pig = new Home_Animal();
        Wild_Animal wolf = new Wild_Animal();
        Wild_Animal shinshila = new Wild_Animal();
        Wild_Animal bear = new Wild_Animal();
        Wild_Animal fox = new Wild_Animal();

        // Student and Aspirant
        // Створити масив типу Student, що містить об'єкти класу Student та Aspirant.
        // Викликати метод getScholarship() кожного елемента масиву.
        Students[] students = new Students[5];
        students[0] = new Students();
        students[1] = new Students();
        students[2] = new Aspirant();
        students[3] = new Aspirant();
        students[4] = new Students();

        for (int i = 0; i < students.length; i++) {
            students[i].avarageMark = i+1;
            System.out.println(students[i].getScholarship(students[i].avarageMark));

        }
        System.out.println();

        // Car
        System.out.println("Task Car");
    Driver driver = new Driver("Jo Biden", 100, 50);
    Engine engine = new Engine("Ford", 2000);
    Lorry lorry = new Lorry("Bugatty","Pemium", 555, driver, engine, 7777);
    lorry.to_String();

        // Goods, Category
        System.out.println();
        System.out.println("Task Goods");

        // Створюємо товари та масив з ними, для класу Категорія.
        Goods goods = new Goods("Pen",1,10);
        Goods goods1 = new Goods("Pencil", 2, 9);
        Goods goods2 = new Goods("Ruler", 3,8);
        Goods[] goodsArr = {goods, goods1, goods2};


        // Створюємо обєкти Category
        Category category = new Category("Shcool", goodsArr);
        Category category1 = new Category("Kinder Garden", goodsArr);

        // Створюємо обєкти User
        User den = new User("Jo_Biden","1111", goodsArr);

        System.out.println("Виводимо на консоль покупки відвідувача магазину");

        den.catalog(den);



        // Task Animal
        System.out.println();
        System.out.println("Task Animals");
        System.out.println();

        // Створюю кота
        Cat Tom = new Cat();
        Tom.name = "Tomas";
        System.out.println();

        //Створюємо собаку
        Dog Pirat = new Dog("Pirate Sparrow");
        System.out.println();

        // Створюємо ведмідя
        Bear Potap = new Bear("Potapich");
        System.out.println();

        // Медвідь у ветеринара
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(Potap);
        System.out.println();

        // Створюємо масив зі звірями
        Animal[] arrAnamal = {Potap, Pirat, Tom};

        // Звірі у лікаря
        for (int i = 0; i < arrAnamal.length; i++) {
            veterinarian.treatAnimal(arrAnamal[i]);
        }
        System.out.println();

        // викликаємо методи makeNoise та eat
        for (int i = 0; i < arrAnamal.length; i++) {
            arrAnamal[i].makeNoise();
            arrAnamal[i].eat();
        }
    }
}
