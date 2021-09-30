package Lesson4;

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

    public static Comparator<Fizik> YearSort = new Comparator<Fizik>() {

        @Override
        public int compare(Fizik o1, Fizik o2) {
            return o1.year - o2.year;
        }
    };

}
