package Lesson8;

import java.util.ArrayList;
import java.util.Comparator;

public class Edit {
    public static void printArray(Fizik[] strongFizik) {
        for (int i = 0; i < strongFizik.length; i++) {
            System.out.print(strongFizik[i].id + " ");
            System.out.print(strongFizik[i].fio + " ");
            System.out.print(strongFizik[i].year + " ");
            System.out.print(strongFizik[i].gender + " ");
            System.out.println(strongFizik[i].inn);
        }
    }

// метод для красивого вывода физиков коллекции
    public static void printFizik(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print(((Fizik)x.get(i)).id + " ");
            System.out.print(((Fizik)x.get(i)).fio + " ");
            System.out.print(((Fizik)x.get(i)).year + " ");
            System.out.print(((Fizik)x.get(i)).gender + " ");
            System.out.println(((Fizik)x.get(i)).inn);

        }
    }



    public static Comparator<Fizik> YearSort = new Comparator<Fizik>() {

        @Override
        public int compare(Fizik o1, Fizik o2) {
            return o1.year - o2.year;
        }
    };

}
