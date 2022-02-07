package peaksoft;

public class Dancer extends Person{
    String groupName;
    @Override
    public String toString(){
        return name+" "+designation+""+groupName;
    }

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    void dancing(){System.out.println("Hip Hop");};
}
