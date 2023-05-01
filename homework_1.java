/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/

package Seminar_4_HW_Java;

import java.util.*;

public class homework_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 15, 25, 35, 45, 55));
        LinkedList<Integer> list2 = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            list2.add(iterator.previous());
        }
        System.out.println(list2);
    }
}