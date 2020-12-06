package collections_training;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet () {
        String name1 = "Ewa";
        String name2 = "Pola";
        String name3 = "Basia";
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        System.out.println(uniqueNames.size());
        uniqueNames.add(name1);
        System.out.println(uniqueNames.size());


    }
}
