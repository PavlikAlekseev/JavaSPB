package Lesson4;

import java.util.Random;

public class UrikClientGenerator implements IClientGenerator{




    @Override
    public Client getRandomClient() {
        int id = randomId();
        int inn = randomInn();
        int ogrn = randomOgrn();
        String name = randomName();
        return new Urik(id, name, inn, ogrn);
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

    private int randomOgrn() {
        int min = 50;
        int max = 9000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    private String randomName() {
        String[] Name = {"ООО Фирма", "Время", "АО Часы", "ИП Снег", "АО Газпром", "ПАО ВТБ", "СНТ Колено"};
        Random random = new Random();
        int x = random.nextInt(Name.length);
        return Name[x];

    }
}
