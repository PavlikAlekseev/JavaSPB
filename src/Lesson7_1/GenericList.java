package Lesson7_1;

public class GenericList<T> {

    private Object[] array = new Object[10];
    private int size;

    public int size(){
        return size;
    }

    public void add(T str) {
        for (int i = 0; i < array.length; i++) {
            if (str.equals((T) array[i])) {
                return;
            }
        }
        size++;
        if (array.length < size){
            Object[] newArray = new Object[array.length + 5];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size-1] = str;
    }

    public void put(T str, int index) {
        if (index > size - 1){
            throw new IndexOutOfBoundsException("Index " + index + " is greater then size " + (size-1));
        }
        if (index < 0){
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        array[index] = str;

    }


    public T get(int index){
        if (index > size - 1){
            throw new IndexOutOfBoundsException("Index " + index + " is greater then size " + (size-1));
        }
        if (index < 0){
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        return (T) array[index];
    }

    public void remove(int index){
        if (index > size - 1){
            throw new IndexOutOfBoundsException("Index " + index + " is greater then size " + (size-1));
        }
        if (index < 0){
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        size--;

        Object[] newArray = new Object[array.length];
        if (index > 0){
            System.arraycopy(array, 0, newArray, 0, index);
        }
        System.arraycopy(array, index + 1, newArray, index, (array.length - (index + 1)));
        array = newArray;
    }


}
