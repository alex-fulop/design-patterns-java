
//For an input array holding the following values: "cat", "dog", "elephant", "lion", generate a mapping between String size and Strings
// that have that respective String size.



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        Map<Integer, List<String>> animalsMap = new HashMap<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("elephant");
        animals.add("lion");

        //grouping by
        animals.forEach((animal) -> {
            if(animalsMap.containsKey(animal.length())) {
                List<String> currentAnimals = animalsMap.get(animal.length());
                currentAnimals.add(animal);
            } else {
                List<String> currentAnimals = new ArrayList<>();
                currentAnimals.add(animal);
                animalsMap.put(animal.length(), currentAnimals);
            }
        });
    }
}