
// 2. Пусть дан список сотрудников:
// 
//         Иван Иванов
//         Светлана Петрова
//         Кристина Белова
//         Анна Мусина
//         Анна Крутова
//         Иван Юрин
//         Петр Лыков
//         Павел Чернов
//         Петр Чернышов
//         Мария Федорова
//         Марина Светлова
//         Мария Савина
//         Мария Рыкова
//         Марина Лугова
//         Анна Владимирова
//         Иван Мечников
//         Петр Петин
//         Иван Ежов

//      Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.Map;
import java.util.stream.Collectors;

public class task_2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Мусина");
        list.add("Иван Мечников");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Иван Мечников");
        list.add("Мария Савина");
        list.add("Анна Мусина");
        list.add("Марина Лугова");
        list.add("Анна Мусина");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Иванов");

        System.out.println();
        System.out.println("Список имён:");
        System.out.println(list);

        Map<String, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println();

        System.out.println("Список имён с количеством повторений:");
        System.out.println(result);
        System.out.println();

        List<Map.Entry<String, Long>> sortedEntries = result.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());
        System.out.println("Отсортированный список имён по популярности:");
        System.out.println(sortedEntries);
        System.out.println();

    }

}