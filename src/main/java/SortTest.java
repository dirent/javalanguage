import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    /**
     * Use lambdas to sort a list of names
     */
    public static void main(String[] args){
        System.out.println( "\nSort a list of names" );
        final List<String> names = Arrays.asList(
                "Andy",
                "Michael",
                "Max",
                "Stefan" );
        names.sort( Comparator.comparingInt(String::length) );
        names.forEach( s -> System.out.print( s.length() + "," ) );
    }
}
