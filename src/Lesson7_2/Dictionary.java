package Lesson7_2;

public class Dictionary<T, Y> {

    private Object[][] array = new Object[0][2];
    private int size;


    public int size(){
        return size;
    }

    public void add(T key, Y value){
        boolean sizeControl = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                array[i][1] = value;
                sizeControl = false;
                break;
            }
        }
        if (sizeControl){   //если не прибавляем size, то нижний блок не выполняется и при этом размер словаря не увеличивается
            size++;
        }

        if (array.length < size){
            Object[][] newArray = new Object[size][2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            array[size - 1][0] = key;
            array[size - 1][1] = value;
        }
    }

    public T get(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                return (T) array[i][1];
            }
        }
        return null;
    }

    public void delete(T key){
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                size--;
                Object[][] newArray = new Object[size][2];
                System.arraycopy(array, 0, newArray, 0, i);
                System.arraycopy(array, i + 1, newArray, i, (array.length - (i + 1)));
                array = newArray;
            }
        }
    }

    // для вывода полного словаря
    public void getArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
