package Lesson4;

import java.util.Random;

public class ClientImpl  implements RandomInterf {



    @Override
    public One getClient() {
        int id = randomId();
        int inn = randomInn();
        int ogrn = randomOgrn();
        int year = randomYear();
        String fioM = randomFioMale();
        String fioF = randomFioFemale();
        String name = randomName();
        String gender = randomGender();

        if (id > 2500000) {
            return new Urik(id, name, inn, ogrn);
        }
        else {
            if (gender.equals("муж")){
                return new Fizik(id,fioM,year, gender, inn);
            }
            else return new Fizik(id,fioF,year, gender, inn);
        }

    }

    public int randomId() {
        int min = 1000000;
        int max = 5000000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    public int randomInn() {
        int min = 100000;
        int max = 500000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    public int randomOgrn() {
        int min = 50;
        int max = 9000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    public String randomName() {
        String[] Name = {"ООО Фирма", "Время", "АО Часы", "ИП Снег", "АО Газпром", "ПАО ВТБ", "СНТ Колено"};
        Random random = new Random();
        int x = random.nextInt(Name.length);
        return Name[x];

    }


    public int randomYear() {
        int min = 1900;
        int max = 2019;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    private String randomGender(){
        String[] gender = new String[]{"муж", "жен"};
        Random random = new Random();
        int i = random.nextInt(gender.length);
        return (gender[i]);
    }

    private String randomFioMale(){
        String[] gender = new String[]{"Попов Александр Сергеевич", "Иванов Сергей Петров", "Смирнов Игорь Сергеевич", "Нога Степан Иванович", "Спина Олег Олегович", "Игнатов Артем Артемович", "Монитор Колено Сергеевич"};
        Random random = new Random();
        int i = random.nextInt(gender.length);
        return (gender[i]);
    }

    private String randomFioFemale(){
        String[] gender = new String[]{"Смирнова Татьяна Сергеевна", "Ольговна Ольга Сергеевич", "Степановна Маша Сергеевич", "Смирнова Лена Сергеевич", "Смирнов Игорь Сергеевич"};
        Random random = new Random();
        int i = random.nextInt(gender.length);
        return (gender[i]);
    }



}
