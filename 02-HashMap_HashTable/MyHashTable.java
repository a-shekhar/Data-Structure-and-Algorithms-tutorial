import java.util.ArrayList;
import java.util.Arrays;

public class MyHashTable {

    private ArrayList<KeyValue> data;
    private int length;

    public MyHashTable(){
        this.data = new ArrayList<>();
        this.length = 1;
    }

    private int hash(String key){
        int hash = 0;
        // just to make it case-insensitive
        key = key.toLowerCase();

        for(int i=0; i < key.length(); i++){
            hash =  (hash + key.codePointAt(i) * i) % this.length;
        }
        return hash;
    }

    private void put(String key, String value){
        int address = this.hash(key);

        KeyValue val = new KeyValue(key, value);

        if(this.data.size() == 0 || this.data.size() < address || this.data.get(address) == null){
            this.data.set(address, val);
            System.out.println(this.data);
        }else{
            this.data.add(val);
        }
        length++;
    }

    private String get(String key){
        int address = this.hash(key);
        KeyValue val =  this.data.get(address);
        if(val == null){
            return "No Key found.";
        }
        return val.getValue();
    }

    /*private String[] keys(){
        String[] keys = new String[this.data.length];
        int index = 0;
        for(int i=0; i< this.data.length; i++){
            if(this.data[i] != null){
                keys[index] = this.data[i].getKey();
                index++;
            }
        }

        return keys;
    }*/
    public static void main(String[] args) {
        MyHashTable obj = new MyHashTable();
        obj.put("name", "Aditya");
        obj.put("address", "Nawada");
        obj.put("via", "Chautham");

        System.out.println(obj.get("name"));
        System.out.println(obj.get("address"));
        System.out.println(obj.get("via"));

        System.out.println(obj.get("Name"));
        System.out.println(obj.get("AddresS"));

        System.out.println(obj.get("Distt"));

       // System.out.println(Arrays.toString(obj.keys()));
    }
}
