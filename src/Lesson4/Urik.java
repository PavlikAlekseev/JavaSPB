package Lesson4;

public class Urik extends Client {
    private int ogrn;
    private String name;

    public Urik(int id, String name, int inn, int ogrn){
        super(id, inn);
        this.name = name;;
        this.ogrn = ogrn;
    }

    public int getOgrn() {
        return ogrn;
    }

    public void setOgrn(int ogrn) {
        this.ogrn = ogrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Urik{" +
                "ogrn=" + ogrn +
                ", name='" + name + '\'' +
                '}';
    }
}
