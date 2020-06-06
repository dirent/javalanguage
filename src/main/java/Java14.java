import java.util.Map;

public class Java14 {

    public static void main( String[] args ) {
        System.out.println( "===Hello Java Records===" );
        var myRecord = new MyRecord( 42, "Hello records" );
        System.out.println(  myRecord  );
        System.out.println(  new MyRecord( -1 )  );

        System.out.println();

        System.out.println( "===Convert Map.Entry to Record===" );
        var developers = Map.of(
                "Java", 24,
                "Ruby", 26,
                "Javascript", 23 );
        developers.entrySet().stream().
                map( Developer::new ).
                forEach(System.out::println);
    }
}
