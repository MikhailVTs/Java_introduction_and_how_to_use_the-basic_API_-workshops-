    // 3** Дана json строка (можно сохранить в файл и читать из файла)
    // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    // Написать метод(ы), который распарсит json и, используя StringBuilder, 
    // создаст строки вида: 
    // Студент [фамилия] получил [оценка] по предмету [предмет].
    // Пример вывода:
    // Студент Иванов получил 5 по предмету Математика.
    // Студент Петрова получил 4 по предмету Информатика.
    // Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class task_3 {
    public static <Dispensador> void main(String args[]) throws IOException, ParseException {

        FileReader reader = new FileReader(new File("f.json"));
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);

        System.out.println();

        for (int n = 0; n < jsonArray.size(); n++) {

            JSONObject object = (JSONObject) jsonArray.get(n);

            String lastname = (String) object.get("фамилия");
            String grade = (String) object.get("оценка");
            String subject = (String) object.get("предмет");
            
            System.out.println("Студент " + lastname + " получил " + grade + " по предмету " + subject);
        }

        System.out.println();
    }
}