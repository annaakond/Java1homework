package dzLesson5;



public class Main {
    public static void main(String[] args, Object printInfo, Person[] persArray) {

        persArray[0] = new Person("Ivan", "engineer", "ivan@ivan.ee", 5525, 600, 21);
        persArray[1] = new Person("Petr Petrovich", "teacher", "petr@petr.ee", 54254475, 800, 40);
        persArray[2] = new Person("Nikolaj", "manager", "nikolaj@kolja", 2353636, 900, 45);
        persArray[3] = new Person("Olga", "manager", "olga@olga.ee", 34657, 900, 42);
        persArray[4] = new Person("Irina", "manager", "irina@irina.ee", 38523865, 900, 35);



        Person[] personArr = new Person[5];
        for (Person person : personArr) {
            person.printInfo();
        }

        //sortAge(); // не разобралась, какой цикл использовать


    }
    //public static void sortAge() {
        //for (int age >= 40) {
       // System.out.print();
    //}

    }

