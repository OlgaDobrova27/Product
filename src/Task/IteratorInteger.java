package Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class IteratorInteger {
    private Set<Integer> numbers = new HashSet<>();

    public IteratorInteger() {
    }

    public void generationNumbers(){
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int t = random.nextInt(1000);
            numbers.add(t);
        }
    }
    public  void removeNumbers() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            var integer = iterator.next();
            if (integer % 2 == 0) {
                iterator.remove();
                System.out.printf(integer + " ");
            }
        }
    }

    @Override
    public String toString() {
        return "IteratorInteger{}" + numbers;
    }
}
