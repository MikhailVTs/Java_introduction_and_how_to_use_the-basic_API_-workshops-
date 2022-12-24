// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.*;

public class task_1 {
	public static void main(String[] args)
	{

        String str_1 = new String("И");
        String str_2 = new String("темен");
        String str_3 = new String("город");
        String str_4 = new String("Мороз");
        String str_5 = new String("узором");
        String str_6 = new String("дорог");
        String str_7 = new String("не");
        String str_8 = new String("мети");

		LinkedList<String> linkEdListStr = new LinkedList<>();

		linkEdListStr.add(str_1);
        linkEdListStr.add(str_2);
        linkEdListStr.add(str_3);
        linkEdListStr.add(str_4);
        linkEdListStr.add(str_5);
        linkEdListStr.add(str_6);
        linkEdListStr.add(str_7);
        linkEdListStr.add(str_8);
        
        System.out.print("Элементы до реверса: " + linkEdListStr);
        linkEdListStr = reverseLinkedList(linkEdListStr);
        System.out.print("\nЭлементы после реверса: " + linkEdListStr);
	}

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> reversLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

        reversLinkedList.add(llist.get(i));
        }

        return reversLinkedList;
    }
}