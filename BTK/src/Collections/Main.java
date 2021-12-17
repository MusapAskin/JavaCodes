package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Musap","Aşkın"));
        for (Customer customer:customers
             ) {
            System.out.println(customer.name+" "+customer.surname);
        }
        HashMap<String,String> dictioanry=new HashMap<String, String>();
        dictioanry.put("Table","Masa");
        dictioanry.put("Book","Kitap");
        dictioanry.put("Computer","Bilgisayar");
        for (String key:dictioanry.keySet()
             ) {
            System.out.println("Key: "+key+"\tValue: "+dictioanry.get(key));
        }
        dictioanry.remove("Table");
        System.out.println(dictioanry.get("Table"));
    }
}
