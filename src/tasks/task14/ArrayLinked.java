package tasks.task14;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            array.add("a");
            linked.add("a");
        }

        long startTime;
        long endTime;

        // из начала
        startTime = System.nanoTime();
        array.get(1);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        linked.get(1);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        //из середины
        startTime = System.nanoTime();
        array.get(500);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        linked.get(500);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        // из конца
        startTime = System.nanoTime();
        array.get(1000);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        linked.get(1000);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
