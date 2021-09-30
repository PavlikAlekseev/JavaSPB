package Lesson4;

public class Fizik extends One {
    String fio;
    int year;
    String gender;


    public Fizik(int id, String fio, int year, String gender, int inn) {
        super(id, inn);
        this.fio = fio;
        this.year = year;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Fizik{" +
                "fio='" + fio + '\'' +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                '}';
    }

}


