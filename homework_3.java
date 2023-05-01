/* Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */

package Seminar_4_HW_Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class homework_3 {
    public static void main(String[] args) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedList<Integer> list2 = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            sum += addList(list2, iterator.previous());
        }
        System.out.println("Сумма всех еллементов равна: " + sum);
        System.out.println("Сохраненные элементы: " + list2);
    }

    static Integer addList(LinkedList<Integer> list, int nextEl){
        list.addFirst(nextEl);
        return nextEl;
    }
}