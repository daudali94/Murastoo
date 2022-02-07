    package peaksoft;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        Person person = new Person("Ali", "Руководитель");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        System.out.println("-----------------------------------");

        Programmer programmer = new Programmer("Samat", "Программист","Facebook");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("-----------------------------------");

        Dancer dancer = new Dancer("Azamat","Танцор","Kara jorgo");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("-----------------------------------");

        Singer singer = new Singer("Daniel Reynolds","Певец","Imagine Dragons");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        System.out.println("-----------------------------------");
    }
}
