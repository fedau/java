import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static int addTwo(int input){
        return input + 2;
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ben", "John", "Will", "Stampler", "Aron", "Annie");

        names.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
        Stream<String> fruits =  Stream.of("Apple", "Pear", "Pinneaple");

        fruits.map(String::toLowerCase)
                .forEach(fruit -> System.out.println(fruit));

        Stream.of(1,2,3,4,5,6,7,8)
//                .map(Streams::addTwo);
                .map(val -> addTwo(val))
                .forEach(val -> System.out.println(val));

        Stream<Integer> intStream = Stream.of(1,2,3,4,5);
        int total = intStream.reduce(0, (sum, nextNum) -> sum + nextNum);
        System.out.println("the total is: " +total);
    }
}

