import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Работаем с MyList
        MyList<String> list = new MyArrayList<>();
        list.add("2");
        list.add("used");
        list.add("20");
        list.add("red");
        list.delete(1);
        System.out.println(list);
        System.out.println(2);

//        Работаем с LinkedList ==HOMEWORK==
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.addLast("Пушкин");
        linkedList.addLast("Лермонтов");
        linkedList.addLast("Толстой");
        linkedList.addLast("Есенин");
        linkedList.addLast("Гоголь");
        linkedList.addFirst("Булгаков");
        linkedList.addFirst("Достоевский");
        linkedList.addLast("Крылов");
        linkedList.remove("Крылов");
        System.out.println("LinkedList - " + linkedList);
        System.out.println(linkedList.get("Пушкин"));
        System.out.println(linkedList.get("Есенин"));
    }
}