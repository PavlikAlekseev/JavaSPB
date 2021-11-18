package Lesson8;

import java.util.Random;

public class FizikClientGenerator implements IClientGenerator {


    @Override
    public Client getRandomClient() {
        int id = randomId();
        int inn = randomInn();
        int year = randomYear();
        String fioM = randomFioMale();
        String fioF = randomFioFemale();
        String gender = randomGender();


        if (gender.equals("муж")){
            return new Fizik(id, fioM, year, gender, inn);
        }
        else
            return new Fizik(id, fioF, year, gender, inn);
    }



    private int randomId() {
        int min = 1000000;
        int max = 5000000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    private int randomInn() {
        int min = 100000;
        int max = 500000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }



    private int randomYear() {
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
