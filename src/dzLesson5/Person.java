package dzLesson5;

import java.util.Random;

public class Person {
    String name;
    String position;
    String email;
    int telephone;
    int salary;
    int age;
    Random random;


    public Person(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
        random = new Random();
    }

    public void printInfo(){
        System.out.println(this);
    }


        public String toString() {
        return "Person{" + "name='" + name + '\'' + ", position='" + position + '\'' + ", email='" + email + '\'' +
                ", telephone=" + telephone +  ", salary=" + salary +  ", age=" + age + '}';
    }
    //public static void sortAge() {
       // do {
            //System.out.println(String name);
       // } while (int age >= 40);
    //}
}


