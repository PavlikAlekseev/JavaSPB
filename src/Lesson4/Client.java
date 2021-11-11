package Lesson4;

public class Client {
    protected int id;
    protected int inn;

    public Client(int id, int inn){
        this.id = id;
        this.inn = inn;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
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
