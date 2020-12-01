package com.company;

public class HashTable <T> {

    Entry[] arrayHash;
    int size;

    public HashTable(int size) {
        this.size =size;
        arrayHash = new Entry[size];
        for(int i = 0; i < size; i++){
            arrayHash[i] = new Entry();
        }
    }

    int getHash(int key){
        return key%size;
    }

    public void put(int key, Object value){
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        Entry newItem = new Entry(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key){
        T value = null;
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        while(arrayValue != null){
            if(arrayValue.getKey() == key){
                value = (T) arrayValue.getValue();
            }
            arrayValue = arrayValue.next;
        }
        return value;
    }

    public static class Entry {

      int key;
      Object value;
      Entry next;

      public Entry(){next = null;}
      public Entry(int key, Object value){
        this.key = key;
        this.value = value;
        next = null;
      }

       public int getKey() {
           return key;
       }

       public Object getValue() {
           return value;
       }
   }

}

class Hash{
    public static void main(String[] args) {
        HashTable<String> table = new HashTable<>(10);

        table.put(1,"Musap");
        table.put(2,"Aşkın");
        table.put(3,"Computer");
        table.put(4,"Scientist");
        System.out.println(table.get(1));
        System.out.println(table.get(2));
        System.out.println(table.get(3));
        System.out.println(table.get(4));

    }
}
