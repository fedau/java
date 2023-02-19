import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams2 {

    public static void main(String[] args) {

//        Stream.of(1,2,3,4,5,6,7,8)
//                .filter(num -> num % 2 == 0 )
//                .forEach(System.out::println);

//        Stream.of(2,5,68,24,89,43,1,10)
//                .filter(num -> num % 2 == 0 )
//                .sorted()
//                .forEach(System.out::println);

//        Stream.of("Giraf", "Elepahnt", "Lion")
//                .limit(2)
//                .forEach(System.out::println);
//       double avg = Stream.of(2,5,68,24,89,43,1,10)
//                .mapToInt(n -> n)
//                .average()
//                .getAsDouble();
//        System.out.println(avg);
//        int max = Stream.of(2,5,68,24,89,43,1,10)
//                .mapToInt(n -> n)
//                .max()
//                .getAsInt();
//        System.out.println(max);

//        Stream.of("Bongo")
//                .peek(val -> System.out.println("value was: " + val))
//                .map(String::toUpperCase)
//                .peek(val -> System.out.println("value now was: " + val))
//                .forEach(n -> System.out.println("done"));

        IntStream.of(1,2,3,4,5,6,7,8)
                .average().getAsDouble();


    }
}
