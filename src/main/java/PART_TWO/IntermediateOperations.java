package PART_TWO;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* DEEP-DIVE INTO INTERMEDIATE OPERATIONS ON A STREAM
 *
 * CODE EXTRACT ONE is an example of mapping one stream to another using the map() method, which takes Function<T,R> as an argument.
 * In the nutshell, all the elements processed by that stream will be transformed using that function.
 *
 * Also in the CODE EXTRACT ONE, .collect(...); is an example of the terminal operation.
 *
 * Three method to go from a stream to stream of primitive type:
 * - mapToInt()
 * - mapToLong()
 * - mapToDouble()
 *
 * Filtering can discard some of the element processed by the stream with a predicate.
 *
 * flatMap operation on a Stream can help to handle 1:p relations.
 *
 */

public class IntermediateOperations {
    @SuppressWarnings("SwitchStatementWithTooFewBranches")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> codeExtractOne();
            default -> throw new IllegalArgumentException("No suitable user input.");
        }
    }

    @SuppressWarnings("SimplifyStreamApiCallChains")
    static void codeExtractOne() {
        // CODE EXTRACT ONE
        List<String> strings = List.of("one", "two", "three", "four");
        // Stream maps "strings" list into a stream and produces length for each element of the "strings" list.
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList()); // Call chain can be simplified to .toList();
        System.out.println("lengths = " + lengths);
    }
}
