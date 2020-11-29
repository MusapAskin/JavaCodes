package com.company;

import java.util.Arrays;

public class DynamicArray<T>{

        Object[] data;
        int size;
        public DynamicArray(){
            size = 0;
            data = new Object[1];
        }
        public int getSize(){
            return data.length;
        }
        public T get(int index){
            return (T) data[index];
        }
        public void put(Object element){
            ensureCapacity(size+1);
            data[size++]=element;
        }
        private void ensureCapacity(int minCapacity){
            int oldCapacity = getSize();
            if (minCapacity > oldCapacity){
                int newCapacity = oldCapacity*2;
                if (newCapacity < minCapacity){
                    newCapacity = minCapacity;
                }
                data = Arrays.copyOf(data,newCapacity);
            }
        }
}

class Dynamic{
    public static void main(String[] args) {
        DynamicArray<Integer> numbers = new DynamicArray<>();
        System.out.println("Size :"+numbers.getSize());
        numbers.put(11);
        System.out.println("Size :"+numbers.getSize());
        numbers.put(12);
        System.out.println("Size :"+numbers.getSize());
        numbers.put(13);
        System.out.println("Size :"+numbers.getSize());
        numbers.put(14);
        System.out.println("Size :"+numbers.getSize());

        for(int i=0; i<numbers.getSize(); i++){
            System.out.println("Element :"+numbers.get(i));
        }

    }
}

