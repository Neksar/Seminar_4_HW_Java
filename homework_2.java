/* Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/

package Seminar_4_HW_Java;

import java.util.*;

public class homework_2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        enqueue(list, 10);
        enqueue(list, 20);
        enqueue(list, 50);
        enqueue(list, 30);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
        System.out.println(list);
    }
    static void enqueue(LinkedList<Object> list, Object item) {
        list.addLast(item);
    }

    static void dequeue(LinkedList<Object> list) {
        System.out.println(list.get(0));
        list.removeFirst();
    }

    static void first(LinkedList<Object> list) {
        System.out.println(list.get(0));
    }

}    
