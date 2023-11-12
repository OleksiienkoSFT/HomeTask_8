package Lesson_8;

public class Students {
    String firstName;
    String lastName;
    String group;
    double avarageMark; // середня оцінка

    public int getScholarship(double avarageMark){
        if (avarageMark==5){
            return 2000;
        }
        else return 1900;
    }
}
class Aspirant extends Students{
    public int getScholarship(double avarageMark){
        if (avarageMark==5){
            return 2500;
        }
        else return 2200;
    }
}
