import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 26.02.2022
 * \*  ----- group JAVA-27 -----
 * \* Description: Домашнее задание к занятию 1.2: Stream API
 * \* Задача 1: Работа с числами - Без STREAM API
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer integer : intList) {
            if (integer > 0) positiveNumbers.add(integer);
        }
        System.out.println("Положительные числа: " + positiveNumbers);
        for (Integer integer : positiveNumbers) {
            if (integer % 2 == 0) evenNumbers.add(integer);
        }
        System.out.println("Чётные числа: " + evenNumbers);
        Collections.sort(evenNumbers);
        System.out.println("Отсортированные числа: " + evenNumbers);
    }
}