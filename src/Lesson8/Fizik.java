package Lesson8;

public class Fizik extends Client {
    protected String fio;
    protected int year;
    protected String gender;


    public Fizik(int id, String fio, int year, String gender, int inn) {
        super(id, inn);
        this.fio = fio;
        this.year = year;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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


