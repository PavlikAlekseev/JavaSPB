package Lesson7_1;

public class Main {
    public static void main(String[] args) {
        /* тоже самое, просто тренировался..
        GenericList<String> stringList = new GenericList<>();
        GenericList<Integer> inLtist = new GenericList<>();
        inLtist.add(1);
        inLtist.add(2);
        inLtist.add(3);
        inLtist.add(4);
        System.out.println("Размер массива: " + inLtist.size());
        System.out.println("Элемент массива №2: " + inLtist.get(2));
        inLtist.remove(3);
        System.out.println("Размер массива после удаления: " + inLtist.size());
        System.out.println("Элемент массива №2 после удаления: " + inLtist.get(2));

         */

        GenericList<Object> objList = new GenericList<>();
        objList.add("aaa");
        objList.add(56);
        objList.add("bbb");
        objList.add("ccc");
        objList.add("ddd");
        objList.add("eee");
        objList.add(21);
        objList.add(32);
        objList.add("ccc");     // не добавляется
        objList.add(56);        // не добавляется

        // весь массив
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }

        System.out.println("Размер массива: " + objList.size());
        System.out.println("Элемент массива №3: " + objList.get(3));

        objList.remove(3);
        System.out.println("Размер массива после удаления: " + objList.size());
        System.out.println("Элемент массива №2 после удаления: " + objList.get(3));

        objList.put("new", 3);
        System.out.println("Элемент массива №2 после замены: " + objList.get(3));

        System.out.println("Новый массив: ");
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }

    }
}
