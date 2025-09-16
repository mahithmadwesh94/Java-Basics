import java.util.HashMap;

public class Hashmaps {

    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Maths", 100);
        examScores.put("Science", 80);
        examScores.put("English", 30);
        examScores.put("Kannada", 40);

        examScores.putIfAbsent("Social Studies", 100);
        examScores.replace("Maths",75);
        examScores.getOrDefault("Religion", -1);

        System.out.println(examScores);

        for(String key:examScores.keySet()){
            System.out.printf("%s is key for value: %d \n",key,examScores.get(key));
            
        }

        System.out.println( examScores.getOrDefault("Religion", -1));
        examScores.remove("Maths");
        examScores.containsKey("Maths");
        examScores.containsValue(55);
        examScores.isEmpty();


        examScores.forEach((key,value) -> {
            System.out.printf("%s has been graded a score of %d \n",key,value);
        });

        examScores.clear();

    }

}
