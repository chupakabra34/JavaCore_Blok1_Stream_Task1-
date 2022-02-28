import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 26.02.2022
 * \*  ----- group JAVA-27 -----
 * \* Description: Домашнее задание к занятию 1.2: Stream API
 * \* Задача 1: Работа с числами - STREAM API
 */
public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}