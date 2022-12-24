

// 2. Реализуйте очередь с помощью LinkedList со следующими методами 
//     enqueue() - помещает элемент в конец очереди, 
//     dequeue() - возвращает первый элемент из очереди и удаляет его, 
//     first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2 {

    public static void main(String[] args) {
 
        String str_1 = new String("Первый");
        String str_2 = new String("Втрой");
        String str_3 = new String("Третий");
        String str_4 = new String("Четвертый");
 
        LinkedList<String> linkEdList = new LinkedList<>();
        linkEdList.add(str_1);
        linkEdList.add(str_2);
        linkEdList.add(str_3);
        linkEdList.add(str_4);
 
        System.out.println(linkEdList);

        // enqueue() - помещает элемент в конец очереди,
        // (addLast() - методы для добавления элемента в конец списка)

        linkEdList.addLast(str_1); 
        System.out.println(linkEdList);

        // dequeue() - возвращает первый элемент из очереди и удаляет его, 
        // (pollFirst() - возвращают первый элемент списка и удаляют его из списка). 
        System.out.println(linkEdList.pollFirst());
        System.out.println(linkEdList);
        
        // first() - возвращает первый элемент из очереди, не удаляя,
        // (peekFirst() - возвращают первый элемент списка.)
        System.out.println(linkEdList.peekFirst());
        System.out.println(linkEdList);

    }
 }