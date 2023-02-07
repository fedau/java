import java.util.HashMap;

public class HashMaps {
    public static void main(String[]args){
//        HashMap<String, String> favoriteFruits = new HashMap<>();
//
//
//        favoriteFruits.put("Alice", "Apple");
//        favoriteFruits.put("Bessy", "false");
//        favoriteFruits.put("Olly", "Orange");
//        System.out.println(favoriteFruits.get("Bessy"));


        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ash", 100);
        ages.put("Ben", 21);
        ages.put("Steve", 80);
        ages.put("Futbol", 2);

        Integer ashAge = ages.get("Ash");
//        Integer ashAge = ages.size();

        String output = "Ash's age is " + ashAge.toString();
        System.out.println(output);


    }

}
