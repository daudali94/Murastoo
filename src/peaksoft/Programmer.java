package peaksoft;

public class Programmer extends Person {
    String companyName;
    @Override
    public String toString(){
        return name+" "+designation+" "+companyName;
    }

    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    void coding(){System.out.println("Разработчик Java");}
}
