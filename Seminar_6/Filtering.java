import java.util.*;

public class Filtering {
    public static Set<Laptop> getFilteredLaptopsBy(Map<String, String> values, List<Laptop> putStore) {
        List<Laptop> sortLaptops = new ArrayList<>();
        Set<Laptop> filterLaptops = new HashSet<>();
        Set<String> keys = values.keySet();
        for (Laptop laptop : putStore) {
            for (var key : keys) {
                if (laptop.toString().contains(key) && laptop.toString().contains(values.get(key))) {
                    sortLaptops.add(laptop.getLaptop());
                }
            }
        }
        for (Laptop laptop : sortLaptops) {

            filterLaptops.add(laptop.getLaptop());
        }
        return filterLaptops;
    }
}