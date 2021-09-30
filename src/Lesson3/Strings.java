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


/*
1) после удаления пробелов можно было сравнить длину и сразу принять решение
2) так же можно было не преобразовывать массив в строку, а сравнить массивы Arrays.equals
String[] a = x.split("");  //в массив и сортировка
Arrays.sort(a);
String[] b = y.split("");
Arrays.sort(b);
if (Arrays.equals(a, b)) {
    System.out.println("Анаграмма");
}
else
    System.out.println("Не анаграмма");
 */
