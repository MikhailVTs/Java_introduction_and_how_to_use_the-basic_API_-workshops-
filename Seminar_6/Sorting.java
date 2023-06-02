import java.util.Set;
import java.util.TreeMap;

public class Sorting {
    public static TreeMap<Integer, Laptop> sortByCost(Set<Laptop> inputSet) {
        TreeMap<Integer, Laptop> sortByCost = new TreeMap<>();
        for (Laptop laptop : inputSet) {
            sortByCost.put(laptop.getCost(), laptop);
        }
        return sortByCost;
    }
}