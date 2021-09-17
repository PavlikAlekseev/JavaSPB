package Lesson3;


import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String x = "Мама45 мыла раму";
        String y = "Раму мыла45 мама";


        x = x.toLowerCase().replace(" ", "");        //убираем регистр и пробелы
        y = y.toLowerCase().replace(" ", "");


        String[] a = x.split("");  //в массив и сортировка
        Arrays.sort(a);
        x = Arrays.toString(a);

        String[] b = y.split("");
        Arrays.sort(b);
        y = Arrays.toString(b);

        if (x.equals(y)){
            System.out.println("true" + " - анаграмма");
        }
        else {
            System.out.println("false" + " - не анаграмма");
        }

    }
}

