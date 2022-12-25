// 1. Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class task_1 {

    public void showPhoneBook() throws IOException, ParseException {

        FileReader reader = new FileReader(new File("phonebook.json"));
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);

        for (int n = 0; n < jsonArray.size(); n++) {

            JSONObject object = (JSONObject) jsonArray.get(n);

            String firstANDlast_Name = (String) object.get("firstANDlast_Name");
            String nomber_home = (String) object.get("nomber_home");
            String nomber_work = (String) object.get("nomber_work");

            System.out.println("Фамилия и Имя " + firstANDlast_Name + " Домашний телефон " + nomber_home
                    + " Рабочий телефон " + nomber_work);
        }

        System.out.println();

    }

    public void phone_number_search() throws IOException, ParseException {

        HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

        List<String> petrovivan = new ArrayList<String>();
        petrovivan.add("32549878");
        petrovivan.add("65457832");

        List<String> ivanovvasiliy = new ArrayList<String>();
        ivanovvasiliy.add("9845563254");
        ivanovvasiliy.add("158459320");

        List<String> sidorovpetr = new ArrayList<String>();
        sidorovpetr.add("3449763012");
        sidorovpetr.add("625148973");

        phoneBook.put("PETROV IVAN", petrovivan);
        phoneBook.put("IVANOV VASILIY", ivanovvasiliy);
        phoneBook.put("SIDOROV PETR", sidorovpetr);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите фамилию = ");
            String last_name = input.next().toUpperCase();

            System.out.print("Введите имя = ");
            String name = input.next().toUpperCase();

            String key_name = last_name + " " + name;

            if (phoneBook.containsKey(key_name)) {

                System.out.println("Фамилия и имя " + key_name + " - "
                        + "[Домашний номер телефона, Рабочий номер телефона] " + phoneBook.get(key_name));
            }
        }
    }

    public static void main(String args[]) throws Exception {

        task_1 pb = new task_1();

        pb.showPhoneBook();
        pb.phone_number_search();

    }

}