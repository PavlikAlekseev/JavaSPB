package Lesson7_2;

public class Main {
    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Dictionary<>();
        dictionary.add(1, "One");
        dictionary.add(2, "Two");
        dictionary.add(3, "Three");
        dictionary.add(4, "Four");

        System.out.println("Cловарь:");
        dictionary.getArray();
        System.out.println("Размер словаря: " + dictionary.size());
        //получать значение по ключу
        System.out.println("Ключ = 1, Значение = " + dictionary.get(1));
        //если ключа в коллекции нет, то возвращать null
        System.out.println("Ключ = 5, Значение = " + dictionary.get(5));
        System.out.println();

        //добавить новую пару. Если ключ уже содержится в коллекции, то соответствующее значение заменяется на новое
        dictionary.add(1, "Один");
        System.out.println("Заменили значение с ключом = 1");
        System.out.println("Cловарь:");
        dictionary.getArray();
        System.out.println("Размер словаря: " + dictionary.size());
        System.out.println("Ключ = 1, Значение = " + dictionary.get(1));
        System.out.println();

        //удалять пару, передав ключ
        dictionary.delete(3);
        //если ключа не содержится, то ничего не делать
        dictionary.delete(5);
        System.out.println("Удалили элемент с ключом = 3");
        System.out.println("Cловарь:");
        dictionary.getArray();
        System.out.println("Размер словаря: " + dictionary.size());
        System.out.println("Ключ = 3, Значение = " + dictionary.get(3));
        System.out.println("--------------------------------");

        //----------------------------------

        Dictionary <Object, Object> dictionaryObj = new Dictionary<>();
        dictionaryObj.add("Иван", "Петров");
        dictionaryObj.add(1, "Банан");
        dictionaryObj.add("Шкаф", 3);
        dictionaryObj.add(5, 2456);
        dictionaryObj.add("Сергей", "Петров");
        dictionaryObj.add(2, "Лампа");

        System.out.println("Cловарь Object:");
        dictionaryObj.getArray();
        System.out.println("Размер словаря: " + dictionaryObj.size());
        System.out.println();

        dictionaryObj.delete("Сергей");
        dictionaryObj.add(2, 456);
        System.out.println("Удалили ключ \"Сергей\" и заменили значение ключа \"2\"");
        System.out.println("Cловарь Object:");
        dictionaryObj.getArray();
        System.out.println("Ключ = 2, Значение = " + dictionaryObj.get(2));
        System.out.println("Ключ = Сергей, Значение = " + dictionaryObj.get("Сергей"));

    }

}

