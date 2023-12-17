package PART_ONE;

import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/* INTRODUCTION TO THE STREAM API
 *
 * In the nutshell, it provides the implementation of the well known map-filter-reduce algorithm to the JDK.
 *
 * Collections Framework is closely used with the Stream API to efficiently process the data.
 * I also works well with IO amd allows to create patterns of other sources of data.
 *
 * There are two goals of the Stream API:
 * - Create readable and expressive code.
 * - Give the runtime time some room to optimise the computations.
 *
 * Stream API is good to use for a nice optimisation reason: A stream is an object that does not store any data.
 *
 * In terms of data processing, a stream processes data in the same order as if you write an equivalent for loop.
 * However, at some cases, stream can produce a result without iterating through all the elements.
 *
 * Streams is about creating pipelines of operations.
 * A pipeline itself is made of the series of method calls on a stream, and each call produces another stream.
 *
 * Intermediate operation --> An operation that returns another stream.
 * Terminal operation --> An operation that returns something else rather than a stream (including void).
 *
 * Good unwritten rules ot follow:
 * - A stream should be created and consumed on the spot.
 * - A stream should not have any side effects.
 *
 */


public class IntroToStreamAPI {
    @SuppressWarnings("SwitchStatementWithTooFewBranches")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> codeExample();
            default -> throw new IllegalArgumentException("No suitable user input.");
        }
    }

    static void codeExample(){
        // EXAMPLE CODE WITH STREAM API
        List<String> stringList = List.of("one", "two", "three", "four");
        var map = stringList.stream()
                // Grouping by the length of the string and counts the numbers of string with same length.
                .collect(groupingBy(String::length, counting()));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));
    }
}
