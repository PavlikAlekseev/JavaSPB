package Lesson8;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        IClientGenerator generatorFizik = new FizikClientGenerator();
        IClientGenerator generatorUrik = new UrikClientGenerator();

        ArrayList<Client> list = new ArrayList<>();
        int size = 20;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                list.add(generatorFizik.getRandomClient());
            }
            else list.add(generatorUrik.getRandomClient());
        }

        //Вывод всех клиентов
        System.out.println("Все клиенты:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //Ищем физиков мужиков и сразу добавляем в новый лист
        ArrayList <Fizik> listFizik = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (list.get(i) instanceof Fizik) {
                if (((Fizik) list.get(i)).gender.equals("муж")) {
                    listFizik.add((Fizik) list.get(i));
                }
            }
        }

        //Сортировка физиков мужиков
        //с использованием ранее созданного метода в классе Edit
        //Collections.sort(listFizik,Edit.YearSort);

        // с использованием метода коллекции
        listFizik.sort(new Comparator<Fizik>() {
            @Override
            public int compare(Fizik o1, Fizik o2) {
                return o1.year - o2.year;
            }
        });

        // красивый вывод физиков
        System.out.println("Физики мужчины отсортированные по возрасту:");
        Edit.printFizik(listFizik);

        /* некрасивый вывод с использованием метода коллекции
        for (int i = 0; i < listFizik.size(); i++) {
            System.out.println(listFizik.get(i));
        }
         */
    }
}



