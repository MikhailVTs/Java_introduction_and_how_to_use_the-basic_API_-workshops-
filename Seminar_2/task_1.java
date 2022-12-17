// 1. Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: 

// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.Map;
import java.util.HashMap;
/* 
Формируем WHERE
*/

public class task_1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {

            if (pair.getValue() != null && pair.getKey() != null) {
                sb.append(pair.getKey());
                sb.append(" : ");
                sb.append('"' + pair.getValue() + '"');
                sb.append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}