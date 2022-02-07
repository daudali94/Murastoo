package peaksoft;

public class Person {
    String name;
    String designation;
    @Override
    public String toString(){
        return name+" "+designation;
    }
    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void learn(){System.out.println("Изучает");}
    void walk(){System.out.println("Гуляет");}
    void eat(){System.out.println("Кушает манты");}
}
