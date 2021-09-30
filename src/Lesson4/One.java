package Lesson4;

public class One {
    int id;
    int inn;

    public One(int id, int inn){
        this.id = id;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "One{" +
                "id=" + id +
                ", inn=" + inn +
                '}';
    }
}
