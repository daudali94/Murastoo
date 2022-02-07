package peaksoft;

public class Singer extends Person{
    String bandName;
    @Override
    public String toString(){
        return name+" "+designation+" "+bandName;
    }
    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    void singing(){System.out.println("Вокал");}
    void playGuitar(){System.out.println("Классика");}
}
