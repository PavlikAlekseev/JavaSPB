package Lesson2;



public class Syntax {
    public static void main(String[] args) {

        String[][] array = {
                {"Иванов Игорь Сергеевич", "72", "муж"},
                {"Смирнов Олег Олегович", "34", "муж"},
                {"Петрова Ирина Ириновна", "17", "жен"},
                {"Нога Марина Павловна", "84", "жен"},
                {"Нос Игнат Иванович", "41", "муж"},
                {"Голова Сергей Сергеевич", "24", "муж"},
                {"Рубаха Иван Иванович", "75", "муж"},
                {"Рука Инна Ольговна", "61", "жен"},
                {"Иванова Алиса Иванович", "38", "жен"},
                {"Кофта Денис Алексеевич", "15", "муж"}
        };

        // сортировка по возрасту
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Integer.parseInt(array[i][1]) > Integer.parseInt(array[j][1])) {
                    String [] x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }

        // вывод жен
        for (String[] strings : array) {  //тут был цикл через for, но idea не дала запушить в таком виде, предложила исправить
            if (strings[2].equals("жен")) {   //такая же история как и выше, не захотел пушить с == вместо equals
                for (int j = 0; j < 2; j++) {
                    System.out.print(strings[j] + "  ");
                }
                System.out.println();
            }
        }
    }
}

/*
p.s. хотел создать новый массив с женщинами пробежавшись по основному (array) и уже новый массив отсортировать и вывести, тогда:
1) основной массив остался бы без изменений
2) не надо было бы сортировать весь основной массив, а только маленький массив с женщинами

НО! Не разобрался как засунуть нужное значение в новый массив

String [][] arrayWomen = new String[][];
for (int i = 0; i < array.length; i++) {
    if (array [i][3] == "жен"){
        for (int j = 0; j < 3; j++) {
            arrayWomen = ...
           }
    }
}
 */
