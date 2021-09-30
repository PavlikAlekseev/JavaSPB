package Lesson4;

public class Urik extends One{
    int ogrn;
    String name;

    public Urik(int id, String name, int inn, int ogrn){
        super(id, inn);
        this.name = name;;
        this.ogrn = ogrn;
    }

    @Override
    public String toString() {
        return "Urik{" +
                "ogrn=" + ogrn +
                ", name='" + name + '\'' +
                '}';
    }
}
